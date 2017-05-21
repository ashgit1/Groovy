class ClosureDemo{
	static void main(String[] args){
		// Simple Closure
		def clos1 = {
			println("Hello Ashish");
		}
		clos1.call();

		// Closure with parameter
		def close2 = {
			param -> println("Hello ${param}");
		}
		close2.call("Kumar");

		// Closure with implicit 'it' keyword parameter
		def close3 = {
			println("Hello ${it}");
		}
		close3.call("Gupta");
	}
}