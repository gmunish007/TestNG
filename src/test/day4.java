package test;

import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void WebLoginHomeLoan() {
		System.out.println("Web Login Home.");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan() {
		System.out.println("Mobile Login Home.");
	}
	
	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("Login API Login Home.");
	}
	

}
