package day10;

import java.awt.List;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample2 {

	public static void main(String[] args) {
		
		ArrayList<String> refList = new ArrayList<String>();
		refList.add("Charles");
		refList.add("Jerret");
		refList.add("Jerret");
		
		System.out.println(refList);
		
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<50;i++){
		System.out.println ("Enter the name");
		String name = sc.next();
		if(refList.contains(name)) {
			System.out.println("Name already exists");
			
		}
		else {
			
			refList.add(name);
			
			
			
		}
		System.out.println(refList);
		}
		
		
		}
	}


