class StringIndexing{

	static void main(String[] args){
		
		String sample = "Hello Ashish atpuG";
		println(sample[6]);

		// print the fist character starting from the back
		println(sample[-1]);
		// print string starting from index 6 to 11
		println(sample[6..12]);
		// print string starting from last index to 5 last 
		// position moving backwards
		println(sample[-1..-5]);  
	}
	
}