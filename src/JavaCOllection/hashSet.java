
package JavaCOllection;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

	
	
	public static void main(String[] args) {
		HashSet< String > hash= new  HashSet<String>();
		 hash.add("nina");
		 hash.add("Sanjay");
			hash.add("Amit Sharma");  
			hash.add("Vijay Raj");  
			hash.add("JaiShankar");  
			hash.add("Raj"); 
			Iterator<String > itr= hash.iterator();
					while(itr.hasNext()) {
			System.out.println(			itr.next());
						
					}
		 
	}
}
