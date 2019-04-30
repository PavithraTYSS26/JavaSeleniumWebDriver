package anusha.java.patterns;

import java.util.Scanner;

public class StudentsGradeSystem {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter Tamil Mark = ");
		int tamil = s1.nextInt();

		System.out.println("Enter English Mark = ");
		int eng = s1.nextInt();

		System.out.println("Enter Maths Mark = ");
		int maths = s1.nextInt();

		System.out.println("Enter Science Mark = ");
		int science = s1.nextInt();

		System.out.println("Enter Social Mark = ");
		int social = s1.nextInt();

		if (tamil >= 35 && tamil <= 100 && eng >= 35 && eng <= 100 && maths >= 35 && maths <= 100 && science >= 35
				&& science <= 100 && social >= 35 && social <= 100) {
			
			int total = tamil + eng + maths + science + social;
			
			System.out.println("Total --> "+total);
			double per = (total * 100) / 500;

			System.out.println(per);

			if (per >= 0 && per < 35)
				System.out.println(" FAIL " + per);
			else if (per >= 35 && per <= 60)
				System.out.println(" PASS " + per);
			else if (per > 60 && per <= 80)
				System.out.println(" FIRST CLASS " + per);
			else if (per > 80 && per <= 100)
				System.out.println(" DISTINCTION " + per);
			else
				System.out.println("Invalid  " + per);
		} 
		else 
		{
			System.out.println("fail mark");
		}

	}

}
