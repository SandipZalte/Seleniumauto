package JavaCOllection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQuenue {
public static void main(String[] args) {

	
	PriorityQueue<String > pq= new PriorityQueue<String>() ;
	
	pq.add("Sanjay");
	pq.add("Amit Sharma");  
	pq.add("Vijay Raj");  
	pq.add("JaiShankar");  
	pq.add("Raj");  
	
	
	System.out.println("head:"+pq.element());  
	System.out.println("head:"+pq.peek());  
	System.out.println("iterating the queue elements:");  
	Iterator<String> itr=pq.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	pq.remove();  
	pq.poll();  
	System.out.println("after removing two elements:");  
	Iterator<String> itr2=pq.iterator();  
	while(itr2.hasNext()){  
	System.out.println(itr2.next()); 
	
}
}
}
