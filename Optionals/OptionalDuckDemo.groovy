class OptionalDuckDemo{

	static void main(String[] args) { 
      // Example of an Integer using def 
      def aint = 100; 
      println(aint); 
		
      // Example of an float using def 
      def bfloat = 100.10; 
      println(bfloat); 
		
      // Example of an Double using def 
      def cDouble = 100.101; 
      println(cDouble);
		
      // Example of an String using def 
      def dString = "HelloWorld"; 
      println(dString); 
   } 
}
/*
If we re-write the above code using duck typing, it would look 
like the one given below. The variable names are given names 
which resemble more often than not the type they represent which 
makes the code more understandable.
*/