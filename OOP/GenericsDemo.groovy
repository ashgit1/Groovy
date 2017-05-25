class GenericsDemo{

	static void main(String[] args) {
      // Creating a generic List collection 
      ListType<String> lstStr = new ListType<String>();
      lstStr.set("Ashish");
      println(lstStr.get());

      ListType<Integer> lstInt = new ListType<Integer>();
      lstInt.set(27);
      println(lstInt.get());
   }
} 

public class ListType<T> {
   private T localt;
	
   public T get() {
      return this.localt;
   }
	
   public void set(T plocal) {
      this.localt = plocal;
   } 
}