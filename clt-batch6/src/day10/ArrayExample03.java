package day10;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

class Customer {
	String name;
	Customer(String name) {
		this.name=name;
	}

	@Override
	public String toString() {
		return name;
	}
	 
	@

} //end of Customer

public class ArrayExample03 {

	public static void main(String[] args) {
		
		ArrayList<Object> refList = new ArrayList<Object>();
		
		refList.add(new Customer("Charles"));
		//refList.add(new Customer("Charles"));
		refList.add(new Customer("Jerret"));
		
		for (int i=0;i<50;i++) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = sc.next();
		refList.add(new Customer(name));;
		System.out.println(refList);
		
		if(refList.equals(name)) {
			System.out.println("Name already exists");
			
		}
		else {
			refList.add(name);
			
			
			
		}
		System.out.println(refList);
		
		}

	}

}
