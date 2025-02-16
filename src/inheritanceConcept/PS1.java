package inheritanceConcept;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1 extends PS{

	@Test
	public void testRun() {
		
		int a=3;
		doThis();
		PS2 obj = new PS2(a);
		System.out.println(obj.increment());
		System.out.println(obj.decrement());
		
		// PS3 ps3 = new PS3(a);
		System.out.println(obj.multiplyTwo());
		System.out.println(obj.multipleThree());
		
	}
	
	

}
