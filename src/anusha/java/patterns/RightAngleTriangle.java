package anusha.java.patterns;

public class RightAngleTriangle {

	public static void main(String[] args) {
		int n=4;
		int sp=3;
		for(int i=0;i<n;i++)
		{
			for(int s=0;s<i;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			sp--;
		}

	}

}

