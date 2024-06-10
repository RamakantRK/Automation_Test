package seleniumTesting;

import org.testng.annotations.*;

public class TestClass {
	@Test
	public void a()
	{
		System.out.println("Hello a");
	}
	
	@Test
	public void test()
	{
	System.out.println("Hello");
	}
	@BeforeTest
	public void testBefore()
	{
	System.out.println("Hello Before");
}
	@AfterTest
	public void testAfter()
	{
	System.out.println("Hello After");
	}
	@AfterMethod
	public void test1()
	{
		System.out.println("Hello There 2");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Hi There beforeTest");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Hi There afterTest");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Hi There beforeMethod");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Hi There afterMethod");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Hi There beforeClass");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Hi There afterClass");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Hi There beforeSuite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Hi There afterSuite");
	}
	
}