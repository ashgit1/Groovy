import java.sql.*; 
import groovy.sql.Sql
 
class InsertTable2 {
   static void main(String[] args) {
      // Creating a connection to the database
      def sql = Sql.newInstance('jdbc:mysql://localhost:3306/TESTDB', 'root', 
         'Root@123', 'com.mysql.jdbc.Driver')
			
      sql.connection.autoCommit = false  
      
      def firstname = "Susy"
      def lastname ="Myla"
      def age = 21
      def sex = "F"
      def income = 7000 
		
      def sqlstr = "INSERT INTO EMPLOYEE(FIRST_NAME,LAST_NAME, AGE, SEX, INCOME) VALUES " + "('${firstname}', '${lastname}', ${age}, '${sex}', ${income} )"
			
      try {
         sql.execute(sqlstr);
         sql.commit()
         println("Successfully committed") 
      } catch(Exception ex) {
         sql.rollback()
         println("Transaction rollback")
      }
		
      sql.close()
   }
}