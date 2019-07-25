package assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Problem13 {

	public static void main(String[] args) {
		 Integer[] numbers = new Integer[] {20,20,30,40,50,50,50};
         
	        System.out.println( "Input array elements: " + Arrays.toString(numbers) );
	         
	        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );
	         
	        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
	         
	       System.out.println( "Elements after removing duplicates: " + Arrays.toString(numbersWithoutDuplicates) );
	       
	       System.out.println( "Length of the removed duplicates: " + numbersWithoutDuplicates.length);
	    }
	}


