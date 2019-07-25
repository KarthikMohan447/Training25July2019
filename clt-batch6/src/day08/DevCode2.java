package day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DevCode2 {
	
	// 1. handle NullPointerException (pointing null)
	// 2. handle NumberFormatException (BufferedReader)
	// 3, handle InputMismatchException (Scanner)

	static void logic() throws IOException {
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		System.out.println(number); */
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number 2");
		int number = Integer.parseInt(br.readLine());
		System.out.println(number);
		}
		catch(NumberFormatException e)
		{
		System.out.println("Buffered Reader read wrong data type");
		
		}
	try {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println(number);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Scanner read wrong data type");
		}
	try{
		String ptr = null;
	
		if(ptr.equals("abc"))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");
		}
	}
	catch(NullPointerException e)
	{
		System.out.println("Pointer referring to null");
	}
	 finally{
		 System.out.println("Closing the file...");
	 }
	}
}
	
	




