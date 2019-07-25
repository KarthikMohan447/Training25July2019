package day05;

class A{
	
	B refB; // class A has a reference of class B

	public void setRefB(B refB) {
		this.refB = refB;
	}
	public B getRefB() {
		return refB;
		
	}	

} // end of class A

class B{
	
	C refC;
	
	public void setRefC(C refC) {
		this.refC = refC;
		
	}
    public C getRefC() {
    	return refC;
    }

} // end of class B

class C{
	String name;
	public void setName(String name){
		this.name = name;
	}
	
}

public class SimpleApplication {
	
	public static void main(String[] args){
		A refA = new A();
		B refB = new B();
		C refC = new C();
		refA.setRefB(refB);
		refB.setRefC(refC);
		refA.getRefB();
		refB.getRefC().show();
		
		
	}

}
