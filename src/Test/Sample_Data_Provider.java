package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample_Data_Provider {
	
	
	
	@DataProvider(name ="TestData")
	public Object [][]data()  {
		return new Object [][] {{5,10},{25,12},{4,27}};
		
	}

	
	@Test(dataProvider = "TestData")
	public void Test1(int a,int b) {
		System.out.println("this Test1 method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
	}

	@Test 
	public void Test2() {
		System.out.println("test2");
	}

	
	@DataProvider(name="NewTest")
	public Object [][]dataA(){
		return new Object [][] {{"SAndip",25},{"Pune",25},{"Nashik",78},{"Indian",420}};
		}
	
	@Test (dataProvider = "NewTest")
	public void Demo(String a,int b) {
		System.out.println("this demo method");
		System.out.println(a);
		System.out.println(b);
	}
	

}
