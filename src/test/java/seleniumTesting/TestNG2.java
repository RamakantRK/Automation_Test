package seleniumTesting;

import org.testng.annotations.*;

public class TestNG2 {
	@Test(priority=-10)
	public void test()
	{
	System.out.println("Hello");
	}
	@Test(priority=1)
	public void testBefore()
	{
	System.out.println("Hello Before");
}
	@Test(priority=0)
	public void testAfter()
	{
	System.out.println("Hello After");
	}
	@Test
	public void test4()
	{
	System.out.println("Hello test4");
		}
	@Test
	public void b1() {
		System.out.println("b1");
	}
}
