package anusha.java.patterns;

public class StudentClass {
	private int Student_ID;
	private String Student_Name;
	long Student_PhoneNumber;
	String Student_MailId;
	String Student_Address;
	String Student_Degree;
	int Student_YOP;

	public StudentClass(int id, String name, long phn) {
		Student_ID = id;
		Student_Name = name;
		Student_PhoneNumber = phn;
	}

	public StudentClass(int id, String name, String mail) {
		Student_ID = id;
		Student_Name = name;
		Student_MailId = mail;
	}

	public int getID() {

		return Student_ID;
	}

	public String getName() {

		return Student_Name;
	}

	public long getPhone() {

		return Student_PhoneNumber;
	}

	public String getMail() {

		return Student_MailId;
	}

	public String getAddress() {

		return Student_Address;
	}

	public String getDegree() {

		return Student_Degree;
	}

	public int getYOP() {

		return Student_YOP;
	}

	public void setID(int id) {

		Student_ID = id;
	}

	public void setName(String name) {

		Student_Name = name;
	}

	public void setPhone(long phn) {

		Student_PhoneNumber = phn;
	}

	public void setMail(String mail) {

		Student_MailId = mail;
	}

	public void setAddress(String add) {

		Student_Address = add;
	}

	public void setDegree(String deg) {

		Student_Degree = deg;
	}

	public void setYOP(int yop) {

		Student_YOP = yop;
	}

	public void studentData() {
		System.out.println(Student_ID);
		System.out.println(Student_Name);
		System.out.println(Student_PhoneNumber);
		System.out.println(Student_MailId);
		System.out.println(Student_Degree);
		System.out.println(Student_YOP);
		System.out.println(Student_Address);
	}

}
