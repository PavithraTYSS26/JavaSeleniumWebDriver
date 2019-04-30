package srinidhi.sixteen.java.programs;

import java.util.Arrays;

public class ReverseFirstArray {
	

		public static void main(String[] args) {
			int[] in= {1,2,3,4,5,6,9,8,7,6};
			  System.out.println("Input Array --> "+Arrays.toString(in));
				System.out.println("FirstHalf is Reversed --> "+Arrays.toString(	reverse(in)));
		}
		public static int[] reverse(int[] arr)
		{
			int st=0;
			int end=(arr.length-1)/2;
			int temp=0;
			for (int i = 0; i < arr.length/4; i++) {
				temp=arr[st];
				arr[st]=arr[end];
				arr[end]=temp;
				st++;
				end--;
			}
			
			return arr;
			
		}

	
}

