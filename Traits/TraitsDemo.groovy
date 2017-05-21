class TraitsDemo{
	static void main(String[] args){
		Student st = new Student();
		st.id = 101;
		st.marks = 89;
		println(st.displayMarks());
	}
}
	
	trait Marks{
		void displayMarks(){
			println("Display Marks");
		}
	}

	class Student implements Marks{
		int id;
		int marks;
	}