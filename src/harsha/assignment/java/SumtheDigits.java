package harsha.assignment.java;

public class SumtheDigits {
public static void main(String[] args) {
    int n = 687; 
    int sum=0;
    System.out.println("Enter digits = "+n);
    System.out.println("Sum of Digits = "+getSum(n));
  
}

static int getSum(int n) 
{     
    int sum = 0; 
     while (n != 0) 
    { 
        sum = sum + n % 10; 
        n = n/10; 
    } 
  
return sum; 
} 

}


