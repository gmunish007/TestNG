package inheritanceConcept;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS {
	public void doThis() {
		System.out.println("this is parent class.");
	}
	
	@BeforeMethod
	public static void beforeMethod() {
		System.out.println("Run me first");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Run me last ");
	}
	
	@Test
	public void newLine() {
		System.out.println("upload first line.");
		System.out.println("upload second line.");
		System.out.println("upload third line.");
		System.out.println("upload fouth line.");
		System.out.println("upload fifth line.");
		System.out.println("upload sixth line.");
		
	}
}
