package JavaCOllection;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedList {
	public static void main(String[] args) {
		
		LinkedList<String> li= new LinkedList<>();
		
		li.add("Ravi");
		li.add("Ravi");
		li.add("sham");
		li.add("Tanvi");
		li.add("jivan");
		li.add("geeta");
		li.add("seta");
		li.add("null");
		
		System.out.println(li.get(5));
		
		Iterator<String> itr=li.iterator();
		
		while(itr.hasNext()) {
			itr.next();
		
			System.out.println(itr.next());
		}
		
	}

}
