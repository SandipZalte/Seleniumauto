package JavaCOllection;

import java.util.Iterator;
import java.util.Vector;

public class vectorList {
	


public static void main(String[] args) {
	
	Vector<String> ve = new Vector<String>();
	ve.add("shamu");
	ve.add("priya");
	ve.add("neesha");
	ve.add("nilam");
	ve.add("pooja");

	 System.out.println(ve.get(4));

	Iterator<String> itr = ve.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());

	}

}
}
