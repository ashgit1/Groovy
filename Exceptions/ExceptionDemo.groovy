class ExceptionDemo{
	static void main(String[] args){
		try {
			def arr = new int[3];
			arr[4] = 4;	
		}
		catch(Exception e) {
			println("Catching the exception");
		}
		finally {
			println("Finally always execute");
		}
		println("Exiting the exception");
	}
}