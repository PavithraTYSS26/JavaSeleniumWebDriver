package srinidhi.sixteen.java.programs;

public class ArmstrongNumber {


		public static int digits(int num)
		{
			int count=0;
			while(num!=0)
			{
				num=num/10;
				count++;
			}
			return count;
		}
		public static int isPower(int x,int n)
		{
			int out=1;
			for (int i=0;i<n ;i++ ) 
			{
				out=out*x;
			}
			return out;
		}
		public static void isArmstrong(int num)
		{
			int temp=num;
			int out=0;
			while(num!=0)
			{
				int last=num%10;
				out=out+isPower(last,digits(temp));
				num=num/10;
			}
			if(temp==out)
			System.out.println("Armstrong : "+temp);
		}
		public static void main(String[] args) {
			System.out.println(	"program starts");
			for (int i=0;i<10000;i++ ) 
				{
						isArmstrong(i);
				}
			System.out.println(	"program ends");
		}
	

}
