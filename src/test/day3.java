package test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class day3 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before executing any methods in class.");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After executing all methods in class");
	}
	

	// This Test Case will not fail for 4 seconds
	// calling getData() on this Test case which has 3 sets of Usernames and password.0
	@Test(timeOut=4000, dataProvider="getData")
	public void WebLoginCarLoan(String username, String pwd) {
		System.out.println("Web Login Car.");
		System.out.println(username);
		System.out.println(pwd);
	}

	@Test(groups= {"Smoke"})
	public void MobileLoginCarLoan() {
		System.out.println("Mobile Login Car.");
	}

	/* This will execute at the beginning of suite. */
	@BeforeSuite
	public void BfSuite() {
		System.out.println("I will execute before every test method in day 3 class.");
	}

	// This methods will execute only after WebLoginCarLoan and MobileLoginCarLoan since it is dependent on it
	@Test(dependsOnMethods= {"WebLoginCarLoan", "MobileLoginCarLoan"})
	public void LoginAPICarLoan() {
		System.out.println("Login API Login Car.");
	}

	// this will skip this Test Case from execution
	@Test(enabled=false)
	public void LoginSigninCarLoan() {
		System.out.println("Login Signin Login Car.");
	}

	@Parameters({"URL", "APIKey/username"})
	@Test
	public void LoginSignOutCarLoan(String urlName, String userName) {
		System.out.println("Login SignOut Login Car.");
		System.out.println(urlName);
		System.out.println(userName);
	}

	/* This will execute at the beginning of all the methods present in this class file. */
	@BeforeMethod
	public void beforeEvery() {
		System.out.println("This will execute before every method in this class file.");
	}

	/* This will execute at the end of all the methods present in this class file. */
	@AfterMethod
	public void afterEvery() {
		System.out.println("This will execute after every method() in this class file");
	}
	
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][2];
		data[0][0] = "firstUsername";
		data[0][1] = "firstPwd";
		
		data[1][0] = "secondUsername";
		data[1][1] = "secondPwd";
		
		data[2][0] = "thirdUsername";
		data[2][1] = "thirdPwd";
		
		return data;

		
	}

}
