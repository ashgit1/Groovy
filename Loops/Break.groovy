class Break{
	static void main(String[] args){
		int[] array = [0, 1, 2, 3, 4, 5];
		for(int i in array){
			println(i);
			if(i==2)
			break;
		}
	}
}