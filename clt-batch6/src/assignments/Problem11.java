package assignments;

import java.util.Arrays;

import java.util.LinkedHashSet;

public class Problem11 {


	public static void main(String[] args)
    {
        
        Integer[] numbers = new Integer[] {1,2,3,1,2,3,4};
         
        System.out.println( "Input array elements: " + Arrays.toString(numbers) );
         
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );
         
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
         
       System.out.println( "Elements after removing duplicates: " + Arrays.toString(numbersWithoutDuplicates) );
    }

}
