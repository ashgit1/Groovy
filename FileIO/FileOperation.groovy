class FileOperation{

	static void main(String[] args){

		println("******************** File Size ********************");
		// getting the file size...
		File file = new File("./FileRead.groovy");
		println("The file ${file.absolutePath} has " +
			" ${file.length()} bytes");

		println("******************** Test File ********************");
		// testing if file is directory...
		def file1 = new File("./FileRead.groovy");
		println("The Path ${file1.absolutePath} is ");
		println("File? ${file1.isFile()}");
		println("Directory? ${file1.isDirectory()}");

		println("******************** mkdir ********************");
		//create a directory
		def file2 = new File("./tempdir");
		file2.mkdir();
		
		println("********************* delete file *******************");
		// delete a file (first create a file testfile.txt in the current directory)
		def file4 = new File("./testfile.txt");
		file4.delete();

		println("******************** copy file ********************");
		// copying the contents of files
		def src = new File("./write.txt");
		def dst = new File("./write1.txt");
		dst << src.text
		
		println("******************** directory contents ********************");
		def rootFiles = new File("test").listRoots();
      	rootFiles.each { 
         	file5-> println(file5.absolutePath); 
      	}
      	
      	println("******************** list dir ********************");
      	new File("./").eachFile(){
      		file6 -> println(file6.getAbsolutePath());
      	}

      	println("******************** recursively list dir ********************");
      	new File("./../").eachFileRecurse(){
      		file7 -> println(file7.getAbsolutePath());
      	}

	}
}