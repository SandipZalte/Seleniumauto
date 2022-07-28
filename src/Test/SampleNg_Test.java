package Test;

import org.testng.annotations.Test;

public class SampleNg_Test {
	
	
	

	@Test(priority = 0)
	public void test() {
		System.out.println("This test method");

	}

	@Test(priority = 1, invocationCount = 3) // ----> invocationCount means How Many time Repeat this test reptatively
	public void Test1() {
		System.out.println("this Test1 method");
	}

	@Test(priority = 2, timeOut = 2000) // timeOut =2000 ----> timeOut means within time excution complted
	public void Test2() {
		System.out.println("test2");
	}

	@Test(priority = 3, enabled = false)
	public void Demo() {
		System.out.println("this demo method");
	}

	@Test(priority = 4, dependsOnMethods = "test") // ----->dependsOnMethods = " " it accept dependent method name as
													// String so pass in double quote
	public void Example() {
		System.out.println("this example method");
	}

}
