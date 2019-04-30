package anusha.java.patterns;

import java.util.Scanner;

public class StudentMainMethod {

	public static void main(String[] args) throws InterruptedException {
		Scanner s = new Scanner(System.in);

		System.out.println("Student id = ");
		int id = s.nextInt();

		System.out.println("Student phone = ");
		long phn = s.nextLong();

		System.out.println("Student mail = ");
		String mail = s.nextLine();

		s.nextLine();

		System.out.println("Student name = ");
		String name = s.nextLine();

		StudentClass sm = new StudentClass(id, name, mail);

		StudentClass sp = new StudentClass(id, name, phn);

		System.out.println("Student object was created successfully...");
		System.out.println("What do you want???");
		System.out.println("Enter your option ");
		System.out.println("1 --> Name ; 2 -->  Id ; 3  --> Email ; 4 --> Phone  ");
		int opt = s.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Name = " + sm.getName());
			break;
		case 2:
			System.out.println("Id = " + sm.getID());
			break;
		case 3:
			System.out.println("Mail = " + sm.getMail());
			break;

		default:
			System.out.println("Invalid option");
			break;
		}

		s.close();

	}

}
