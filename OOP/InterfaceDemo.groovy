class InterfaceDemo{
	static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
      st.Marks1 = 10;
      println("marks: " + st.DisplayMarks());
   } 
} 

interface Marks { 
   void DisplayMarks(); 
} 

class Student implements Marks {
   int StudentID
   int Marks1;
	
   void DisplayMarks() {
      println("Dmarks: " + Marks1);
   }
}