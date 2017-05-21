import java.sql.*; 
import groovy.sql.Sql
 
class ReadTable {
   static void main(String[] args) {
      // Creating a connection to the database
      def sql = Sql.newInstance('jdbc:mysql://localhost:3306/TESTDB', 'root', 
         'Root@123', 'com.mysql.jdbc.Driver')  
			
      sql.eachRow('select * from employee') {
         row -> 
         println([row.FIRST_NAME, row.LAST_NAME, row.age, row.sex, row.INCOME])
      }  
		
      sql.close()
   } 
}