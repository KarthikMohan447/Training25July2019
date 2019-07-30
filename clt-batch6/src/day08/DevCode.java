package day08;

public class DevCode {

	static void logic(int number){
		
	try {
	/*	int temp = number/0;
		System.out.println(temp);
	*/	
		int a[] = {10,20,30,40,50};
		a[50] = 5000;
		String ptr = null;
		System.out.println(a[50]);
		
	} catch (ArithmethicException e) {
		System.out.println("A number can't be divisible by 0.");
	}
	
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("handled ArrayIndexOutOfBoundsException");
	}

	catch(Exception e){
		System.out.println("Exception is the super class of all Exception classes");
	} 
	finally {
		System.out.println("closing files...");
	}
	}

}
