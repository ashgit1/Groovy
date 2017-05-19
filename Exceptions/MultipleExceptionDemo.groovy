class MultipleExceptionDemo{
	static void main(String[] args){
		try {
			def arr = new int[3];
			arr[5] = 5;	
		}
		catch(ArrayIndexOutOfBoundsException aee) {
				println("Array Index Out Of Bounds Exception caught");
		}
		catch(Exception e){
			println("Catching the Exception Object");
		}

		println("Exiting the application");
	}
}