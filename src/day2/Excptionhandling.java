package day2;

public class Excptionhandling {
	public void Division() {
		int a=20;
		int b=0;
		int c=0;
		try {
			c=a/b;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(c); 
		
	
	}
	public static void main( String [] args)
{
		System.out.println("this is helo line before exception handleing");
		Excptionhandling obj =new Excptionhandling();
		obj.Division();
		
		System.out.println("This excption handling statment after ");
}
}
