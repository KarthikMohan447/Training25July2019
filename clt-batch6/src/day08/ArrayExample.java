package day08;

import java.util.Scanner;

class Person {
	
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}	
	
	/*public Person(int id, String name) {
		this.id=id;
		this.name=name;
	
	@override
	public String toString() {
		return id+" "+name;
	}
	
	}
	
}
*/
public class ArrayExample {

	public static void main(String[] args) {
		
		/*String str[] = ("Physics","Chemistry","Maths");
		
		for (int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		} // traditional for loop

		for (String temp : str) {
			System.out.println(temp);
		} // for each loop
		*/
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many records you want to enter : ");
		int number = sc.nextInt();
		Person pRef[] = new Person[number];
		
		for (int i=0;i <pRef.length;i++){
			System.out.println("Enter your ID : ");
			int id = sc.nextInt();
			System.out.println("Enter your Name : ");
			String name = sc.next();
			Person refPerson = new Person();
			refPerson.setId(id);
			refPerson.setName(name);
			pRef[i] = refPerson;
			
			
		} // end of for loop
	
	for(Person person : pRef) {
		System.out.println(person); // person is reference of Person class
	}
} 
	
}	
	


