package JavaCOllection;

import java.util.Iterator;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		
		Stack<String > stack= new Stack<String>();
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.add("nina");
		stack.pop();   //its stop the last line
		
//		System.out.println(4);
		
		
		stack.push("sandip");  
		stack.push("manu"); 
		
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		
	
		
		}
	}
}
