package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable {
	
	String name, city;
	transient int mobile;
	int age;

	public static void main(String[] args) {
		
		SerializationDemo e = new SerializationDemo();
		e.name = "David";
		e.city = "Melbourne";
		e.mobile = 1222233;
		e.age = 25;
		
		try {
		FileOutputStream fileOut = new FileOutputStream("david.txt"); // Create
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(e); // Encypted Form
		out.close();
		fileOut.close();
		} catch(IOException i) {
			i.printStackTrace();
			
		}
		
	

	}

}
