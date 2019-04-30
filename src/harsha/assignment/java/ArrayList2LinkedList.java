package harsha.assignment.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayList2LinkedList {
	public static void main(String[] args) {
		
		ArrayList<String> lst=new ArrayList();
		lst.add("pragasam");
		lst.add("pragasam");
		lst.add("shanthi");
		lst.add("kaviyarasan");
		lst.add("pavithra");
		
		System.out.println(" list  "+lst);
		System.out.println(lst.size());
		
		LinkedList<String> ll=new LinkedList(lst);
		
		
		System.out.println("set "+ll);
		
	}

}
