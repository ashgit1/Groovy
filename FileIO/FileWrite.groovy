import java.io.File;

class FileWrite{
	static void main(String[] args){
		new File("./", 
			"write.txt").withWriter('utf-8') { 
				writer -> writer.writeLine 'Hello Groovy'	
			}
	}
}
