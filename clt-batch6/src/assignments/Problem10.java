package assignments;

public class Problem10 {

	public static void main(String[] args) {
		int arr1[] = {1,5,10,20,40,80};
		int arr2[] = {6,7,20,80,100};
		int arr3[] = {3,4,15,20,30,70,80,120};
		int x,i=0,j=0,k=0;
	    System.out.print("\n input1: ");
	    for(x=0;x<arr1.length;x++)
	    {
	    	System.out.print(arr1[x] + " ");
	    }
	    
	    System.out.print("\n input2: ");
	    for(x=0;x<arr2.length;x++)
	    {
	    	System.out.print(arr2[x] + " ");
	    }
	    
	    System.out.print("\n input3: ");
	    for(x=0;x<arr3.length;x++)
	    {
	    	System.out.print(arr3[x] + " ");
	    }
	
	System.out.print("\n The common elements in the 3 sorted array are: ");
	while (i<arr1.length && j<arr2.length && k<arr3.length)
	if (arr1[i] == arr2[j] && arr2[j] == arr3[k])
		{
		System.out.print(arr1[i]+ " ");
		i++;
		j++;
		k++;
		} else if(arr1[i] < arr2[j])
		{
			i++;
		} else if(arr2[j] < arr3[k])
		{
			j++;
		} else
		{
			k++;
		}
			
	}
	
}
