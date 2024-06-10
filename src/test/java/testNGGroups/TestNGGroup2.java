package testNGGroups;

import org.testng.annotations.Test;
@Test(groups = "all") // run all test groups
public class TestNGGroup2 {

	@Test(groups = {"smoke" , "sanity"})
	public void test1()
	{
	System.out.println("Hello");
	}
	@Test(groups = {"functional"})
	public void test2()
	{
	System.out.println("Hello test2");
    }
	@Test(groups = {"Unit"})
	public void test3()
	{
	System.out.println("Hello test3");
	}
	@Test(groups = {"smoke" , "unit"})
	public void test4()
	{
	System.out.println("Hello test4");
		}
	@Test(groups = {"functional" , "unit"})
	public void test5() {
		System.out.println("Hello test5");
	}
	@Test(groups = {"smoke"})
	public void test6()
	{
	System.out.println("Hello test6");
    }
	@Test(groups = {"regression" , "sanity" , "smoke" , "unit"})
	public void test7()
	{
	System.out.println("Hello test7");
    }
}
