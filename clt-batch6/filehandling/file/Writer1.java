package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

class Writer1 {

	public static void main(String[] args)  {
		
	try { // warning: exception handling
		
		boolean newFile = false;
		
		File f = new File("abcxyz.doc");
		System.out.println(f.exists()); // look for a real file	// false	true
		
		newFile = f.createNewFile(); // maybe create a file!
		System.out.println(newFile); // already there?			// true		false
		System.out.println(f.exists()); // look again */		// true		false
		
		FileWriter fw=new FileWriter("abcxyz.doc");
		BufferedWriter br = new BufferedWriter(fw);
		
		br.write("this is filewriter7");
		// br.flush();
		br.newLine();
		// br.flush();
		br.write("thank you...");
		br.newLine();
		br.write("Java");
		br.newLine();
		br.write("SAP");
		br.newLine();
		br.write(".Net");
		br.close();
	
	}
	catch (Exception e) {
		System.out.println("Error...");
	}
	}
}


