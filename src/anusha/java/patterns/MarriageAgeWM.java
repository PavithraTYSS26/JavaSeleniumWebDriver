package anusha.java.patterns;

import java.util.Scanner;

public class MarriageAgeWM {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println(" Gender ");
		String gen=s.nextLine();
		
		System.out.println(" Age   ");
		int age=s.nextInt();
		
		
		if(gen.equals("male"))
			if( age>21)
				System.out.println(" You are Eligible for marriage Man");
		    else
		    	System.out.println(" You are Not Eligible for marriage Man");
		
		
		
		else if(gen.equals("female") )
			if(age>=18)
				System.out.println(" You are Eligible for marriage Woman");
		    else
		    	System.out.println(" You are Not Eligible for marriage Woman");
		
		
		else
		
			System.out.println(" You are so good");
		
			
		
	}

}
