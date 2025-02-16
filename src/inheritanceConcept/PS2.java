package inheritanceConcept;

public class PS2 extends PS3{
	
	int a;
	public PS2(int a) {
		super(a); // parent class constructor invoked
		
		this.a=a; // created constructor
	}
	
	public int increment() {
		a++;
		return a;
	}
	
	public int decrement() {
		a--;
		return a;
	}
}
