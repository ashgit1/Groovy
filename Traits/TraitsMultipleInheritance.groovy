class TraitsMultipleInheritance{
	static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;	
      st.DisplayMarks();
      st.DisplayTotal(); 
   } 
}

trait Marks {
   void DisplayMarks() {
      println("Marks1");
   } 
} 

trait Total {
   void DisplayTotal() { 
      println("Total");
   } 
}  

class Student implements Marks,Total {
   int StudentID 
}   