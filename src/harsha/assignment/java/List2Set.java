package harsha.assignment.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class List2Set {
	public static void main(String[] args) {
		List<String> lst=new ArrayList();
		lst.add("pragasam");
		lst.add("pragasam");
		lst.add("shanthi");
		lst.add("kaviyarasan");
		lst.add("pavithra");
		
		System.out.println(" list  "+lst);
		System.out.println(lst.size());
		
		Set<String> st=new TreeSet<>(lst);
		
		System.out.println("set "+st);
		
	}

}
