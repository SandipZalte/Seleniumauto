package JavaCOllection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayatList {
	
	
	
	
	public static void main (String[] arrs) {
		
	
	// ArrayList accept nutt value ,Duplicate value and Follow the  insertion order like index order
		
		ArrayList alist=new ArrayList();
		alist.add("velocity");
		alist.add(10);
		alist.add(100.5);
		alist.add(null);
		alist.add(10);
		alist.add(null);
		alist.add("Velocity");
		alist.add('a');
		
		System.out.println(alist.get(0));
		System.out.println(alist.get(1));
		System.out.println(alist.get(2));
		System.out.println(alist.get(4));
		System.out.println(alist.get(5));
		System.out.println(alist.get(5));
		System.out.println(6);
		
		System.out.println("---------------------------------------------");
		
		ArrayList <String >li= new ArrayList<String>();
		li.add("Sandip");
		li.add( "rama");
		li.add("seta");
		System.out.println(li.size());
		
		Iterator<String> itr = li.iterator(); 	// itrator interface used here to call 
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
		
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	
		
		
		
			
			
		}

	
	
		
	}	

