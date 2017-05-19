class AbstractDemo{
	
	 static void main(String[] args) { 
      Student st = new Student(); 
      st.StudentID = 1;
		
      st.Marks1 = 10; 
      st.name="Joe"; 
		
      println("name: " + st.name); 
      println("marks: " + st.DisplayMarks()); 
   } 
} 

abstract class Person { 
   public String name; 
   public Person() { } 
   abstract void DisplayMarks();
}
 
class Student extends Person { 
   int StudentID 
   int Marks1; 
	
   public Student() { 
      super(); 
   } 
	
   void DisplayMarks() { 
      println(Marks1); 
   }  
} 