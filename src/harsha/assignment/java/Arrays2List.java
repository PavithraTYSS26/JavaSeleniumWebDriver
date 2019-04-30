package harsha.assignment.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays2List {
	
	public static void main(String[] args) {
		String[] arr= {"pragasam","shanthi","pavithra","kavi","kavi"};
		
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		
		
		List<String> lst=new ArrayList(Arrays.asList(arr));
		
		
		System.out.println(lst);
	}

}
