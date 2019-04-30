package srinidhi.sixteen.java.programs;

interface Account
{
	void deposit(double amnt);

	double withdraw(int pin);

	static void createAc(String name, long adhaar) 
	{
		String ac_Holder_Name = name;
		long ac_No = 626722057;
	}
}

class Savings implements Account 
{
	public static final int pin = 0007;
	private static double bal;

	public void setBal(double bal) 
	{
		if (bal > 0)
			this.bal = bal + this.bal;
	}

	public double getBal(int pin) 
	{
		if (this.pin == pin)
			return bal;
		else
			return -1111;
	}
	@Override
	public void deposit(double amnt)
	{
		setBal(amnt);
		System.out.println("Balance successfully deposited to Savingsaccount ");
	}

	@Override
	public double withdraw(int pin) 
	{
		double available=getBal(pin);
		System.out.println("withdraw from Savingsaccount");
		return available;
	}
}

class Fixed implements Account 
{
	private static final int pin = 0006;
	private static double bal;

	public void setBal(double bal) 
	{
		if (bal > 0)
			this.bal = bal + this.bal;
	}

	public double getBal(int pin) 
	{
		if (this.pin == pin)
			return bal;
		else
			return -1111;
	}
	@Override
	public void deposit(double amnt) 
	{
		setBal(amnt);
		System.out.println("Balance successfully deposited into Fixedaccount");
	}

	@Override
	public double withdraw(int pin) 
	{
		double available=getBal(pin);
		System.out.println("withdraw from Fixedaccount");
		return available;
	}
}

public class OOPSConcept {
	public static void main(String[] args) {
		Account f=new Fixed();
		f.deposit(1000);
		System.out.println(f.withdraw(0006));
		Account s=new Savings();
		s.deposit(2000);
		System.out.println(s.withdraw(0007));
		

	}
}
