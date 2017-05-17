class ListPlus{
	static void main(String[] args){
		
		def lst = [11, 12, 13, 14, 15];
		def newlst = [];

		newlst = lst.plus([16, 17]);
		println("Org List: " + lst);
		println("New List: " + newlst);
	}
}