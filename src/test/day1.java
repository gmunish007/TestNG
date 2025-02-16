package test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class day1 {

	/* This will execute at the end of the module it is added in */
	@AfterTest
	public void lastExecution() {
		System.out.println("I will execute last.");
		
	}

	@Test
	public void demo() {
		System.out.println("print demo");
		Assert.assertTrue(false);
	}

	@Test
	public void day1Demo() {
		System.out.println("print day1");
	}

	/*This will execute at the end of suite.*/
	@AfterSuite
	public void AfSuite() {
		System.out.println("I will execute after all the suites.");
	}

}
