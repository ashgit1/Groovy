class DateOperation{
	static void main(String[] args){
		Date date1 = new Date("01/11/2015");
		Date date2 = new Date();

		// getTime() : Returns the number of milliseconds since January 1, 1970
		println(date1.getTime());
		println(date2.getTime()); 

		// compareTo() : compare 2 dates
		println(date1.compareTo(date2));
		println(date2.compareTo(date1));	
	}
}