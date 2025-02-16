package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups= {"Smoke"})
	public void ploan() {
		System.out.println("print day2");

	}

	/*This will execute at the beginning of the module it is added in*/
	@BeforeTest
	public void preRequisite() {
		System.out.println("I will execute first in my module.");
	}

}
