class DateDemo1{
	static void main(String[] args){
		
		Date date = new Date();
		// display time and date using toString() method
		println(date.toString());

		Date date2 = new Date(100000); 
		// keep changing this value in multiples of 1000
		println(date2.toString());
	}
}