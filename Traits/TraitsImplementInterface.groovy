class TraitsImplementsInterface{
	static void main(String[] args){
		Student st = new Student();
		st.id = 101;
		st.marks = 91;
		st.DisplayTotal();
		st.DisplayMarks();
	}
}

interface Total{
	void DisplayTotal();
}

trait Marks implements Total{
	void DisplayTotal(){
		println("Display Total");
	}
	void DisplayMarks(){
		println("Display Marks");
	}
}

class Student implements Marks{
	int id;
	int marks;
}