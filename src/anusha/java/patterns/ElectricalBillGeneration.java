package anusha.java.patterns;

import java.util.Scanner;

public class ElectricalBillGeneration {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the unit ");
		
		double unit=s.nextDouble();
		double fine=0;
		double discount=0;
		double arrears=0;
		double amt=0;
		
		
			if(unit<=50)
				amt=unit*1.20;
			
			else if(unit>50  &&  unit<=100)
				amt=50*1.20+(unit-50)*2.40;
			
			else if(unit>100 &&  unit<=150)
				amt=50*1.20+50*2.40+(unit-100)*3.60;
			
			else if(unit>150 && unit<=200)
				amt=50*1.20+50*2.40+50*3.60+(unit-150)*4.80;
			
			else if(unit>200)
				amt=50*1.20+50*2.40+50*3.60+50*4.80+(unit-200)*discount;
			
		System.out.println(amt);
		
		
			amt=amt+arrears+fine-discount;
			
	}

}
