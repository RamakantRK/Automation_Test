package seleniumTesting;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG3 {

	public class TestNG2 {
		@Test(priority=-10,enabled = false & true)// removing method for this enabled but bydeafult its true 
		public void test()
		{
		System.out.println("Hello");
		}
		@Test(priority=1, description = "Verify description")
		public void testBefore()
		{
		System.out.println("Hello Before");
	}
		@Test(priority=0, invocationCount = 2) // for running multiple times using this 
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
			 throw new SkipException("Skiiped this Method"); // for skipping
		}
	}
}
