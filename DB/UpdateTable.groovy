import java.sql.*; 
import groovy.sql.Sql 

class UpdateTable {
   static void main(String[] args){
      // Creating a connection to the database
      def sql = Sql.newInstance('jdbc:mysql://localhost:3306/TESTDB', 'root', 
         'Root@123', 'com.mysql.jdbc.Driver')
			
      // Before Update
      println("************* Before Update *************");
      sql.eachRow('select * from employee') {
         row -> 
         println([row.FIRST_NAME, row.LAST_NAME, row.age, row.sex, row.INCOME])
      }  
      println("*****************************************");

      sql.connection.autoCommit = false
      def sqlstr = "UPDATE EMPLOYEE SET AGE = AGE + 1 WHERE SEX = 'M'" 
	  
      try {
         sql.execute(sqlstr);
         sql.commit()
         println("Successfully committed")
      }catch(Exception ex) {
         sql.rollback() 
         println("Transaction rollback")
      }
		
      // After Update
      println("************* After Update *************");
      sql.eachRow('select * from employee') {
         row -> 
         println([row.FIRST_NAME, row.LAST_NAME, row.age, row.sex, row.INCOME])
      }
      println("*****************************************");
      sql.close()
   } 
}