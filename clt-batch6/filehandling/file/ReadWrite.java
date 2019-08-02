
package file;

import java.io.*;
import java.util.Scanner;
 
class ReadWrite 
{ 
    public static void main(String[] args) throws IOException 
    {
    
    	int word=0;
    	
    	// Entering the File Name
    	System.out.println("Please enter the File Name");  
    	
    	Scanner sc = new Scanner(System.in);
    	String filename = sc.next();  // Reading the file name
    	
    	File f = new File(filename);	// Creating the object for the file name
    	boolean exists = f.exists();
    	System.out.println(exists);
    	
    	if(exists == true) {				// Checking if the file exists
    		System.out.println("File exists");
    	}
    	
    	else {
    		System.out.println("File does not exists");
    		f.createNewFile(); // Creation of File if file doesn't exist
    	}
    	
    	System.out.print("Enter Text to File"); // Entering the text
    	sc = new Scanner(System.in);
    		
    	String text = sc.nextLine(); //Reading the text
    	
    	try (FileWriter writer = new FileWriter(filename)) { // Initialization of write
    		writer.write(text);
    	}
    	catch (IOException e){							// Catching exception
    		System.out.println("No text entered");
    	}
    	FileReader fs = new FileReader(f);				// Creation of object for reading the file
    	BufferedReader br = new BufferedReader(fs);
    	String sentence = br.readLine();				// Reading of first Line
    	while (sentence!=null){							
    		String[] count = sentence.split(" ");		// Using Split function to create array of words
    		for(String temp : count) {					// Iteration using for each loop
    			word++;									
    		}
    	sentence = br.readLine();
    	}
    
        System.out.println("Number of words :" + word);	// Printing the number of words
        System.out.println("Writing successful"); 
        
    } 
}