package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sampleParameterizedNg {
	
	
	@Parameters({"a","b"})
	@Test(priority = 0)
	public void test(int a,int b) {
		System.out.println("This test method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);

	}

	@Test(priority = 1 ) // ----> invocationCount means How Many time Repeat this test reptatively
	public void Test1() {
		System.out.println("this Test1 method");
	}

	


}
