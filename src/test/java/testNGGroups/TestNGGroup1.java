package testNGGroups;

import org.testng.annotations.Test;

public class TestNGGroup1 {
	
			@Test(groups = {"smoke" , "sanity"})
		public void test1()
		{
		System.out.println("Hello");
		}
		@Test(groups = {"regression" , "sanity"})
		public void test2()
		{
		System.out.println("Hello test2");
	    }
		@Test(groups = {"sanity"})
		public void test3()
		{
		System.out.println("Hello test3");
		}
		@Test(groups = {"smoke" , "regression"})
		public void test4()
		{
		System.out.println("Hello test4");
			}
		@Test(groups = {"regression"})
		public void test5() {
			System.out.println("Hello test5");
		}
		@Test(groups = {"smoke"})
		public void test6()
		{
		System.out.println("Hello test6");
	    }
		@Test(groups = {"regression" , "sanity" , "smoke"})
		public void test7()
		{
		System.out.println("Hello test7");
	    }
	}


