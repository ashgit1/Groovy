class ListMinus{
	static void main(String[] args){
		
		def lst = [11, 12, 13, 14, 15];
		def newlst = [];

		newlst = lst.minus([15, 11]);
		println("Org List: " + lst);
		println("New List: " + newlst);
	}
}