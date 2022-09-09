package JavaProgram;

public class Array_Rev_String {
public static void main(String[] args) {
	
	String []  s= {"saaa","Pankaj","Sandip","Pooja","namarat"};
	String st= s[4];
	System.out.println( st.length());
	
	for(int i=st.length()-1;i>=0;i--) {
		System.out.print(st.charAt(i));
		
		
	}
	
	
	
	
	
}
}
