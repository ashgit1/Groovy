class ExceptionMethods{
	static void main(String[] args){
		try {
			def arr = new int[3];
			arr[4] = 5;	
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			println("toString() : " + ae.toString());
			println("- - - - - - - - - - - - - - - - ");

			println("getMessage() : " + ae.getMessage());
			println("- - - - - - - - - - - - - - - - ");

			println("getStackTrace() : " + ae.getStackTrace());
			println("- - - - - - - - - - - - - - - - ");
		}
		catch(Exception e){
			println("Catching Exception Object");
		}
		finally {
			println("finally always executes...");
		}
		println("Exiting the program");
	}
}