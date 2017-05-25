import java.sql.*; 
import groovy.sql.Sql 

class InsertTable {
   static void main(String[] args) { 
      // Creating a connection to the database
      def sql = Sql.newInstance('jdbc:mysql://localhost:3306/TESTDB', 'root', 
         'Root@123', 'com.mysql.jdbc.Driver');
			
      sql.connection.autoCommit = false;
		
      def sqlstr = """INSERT INTO EMPLOYEE(FIRST_NAME,
         LAST_NAME, AGE, SEX, INCOME) VALUES ('Ashish', 'Gupta', 27, 'M', 15000)""" ;
      try {
         sql.execute(sqlstr);
         sql.commit();
         println("Successfully committed") ;
      }catch(Exception ex) {
         sql.rollback();
         println("Transaction rollback") ;
      }
		
      sql.close();
   } 
}