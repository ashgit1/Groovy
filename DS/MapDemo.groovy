class MapDemo{
	static void main(String[] args){
		def map = [
		 			"Name" : "Ashish", 
		 			"Age" : "27"
		 		  ];
		// print the keys
		println("keys: " + map.keySet()); 	
		// checks for keys
		println(map.containsKey("Name"));
		println(map.containsKey("Sex"));
		// put objecs in map
		map.put("Country", "India");
		println(map);
		// get objects from map
		println(map.get("Name"));	
		// returns the size of the map
		println("Size of Map: " + map.size());
		// returns all the values of map
		println(map.values());
	}	
}