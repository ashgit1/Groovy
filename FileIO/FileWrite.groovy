import java.io.File;

class FileWrite{
	static void main(String[] args){
		new File("/Users/a0k00ee/Documents/Ashu/learn/groovy/FileIO/", 
			"write.txt").withWriter('utf-8') { 
				writer -> writer.writeLine 'Hello Groovy'	
			}
	}
}