package harsha.assignment.java;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList2ArrayList {
	public static void main(String[] args) {
		LinkedList<String> lst=new LinkedList();
		lst.add("pragasam");
		lst.add("pragasam");
		lst.add("shanthi");
		lst.add("kaviyarasan");
		lst.add("pavithra");
		
		System.out.println(" list  "+lst);
		System.out.println(lst.size());
		
		
		ArrayList<String> al=new ArrayList(lst);
		
		System.out.println("set "+al);
		
	}

}
