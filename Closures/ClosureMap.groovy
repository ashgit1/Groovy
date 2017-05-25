class ClosureMap {
   static void main(String[] args) {
      def mp = ["Name" : "Ashish", "Professional" : "Software Engineer"];            
      mp.each {
      	println(it);
      };
      mp.each {
      	println("${it.key} maps to: ${it.value}");
      };
   } 
}