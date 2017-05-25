class ClosureList{
	static void main(String[] args){
		def lst = [10, 11, 12, 13, 14];
		lst.each {
			println(it);
		}
	}
}
/*The list collection type then defines a function called .each. 
This function takes on a closure as a parameter and applies the 
closure to each element of the list.*/