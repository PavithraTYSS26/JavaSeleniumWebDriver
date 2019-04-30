package srinidhi.sixteen.java.programs;

public class ReverseArrayElements {

	public static void main(String[] args) {
		int[] in= {1,2,3,4,5,6};
		int[] out=reverse(in);
		for (int i = 0; i < out.length; i++) {
			System.out.print(out[i]);
		}
	}
	public static int[] reverse(int[] arr)
	{
		int st=0;
		int end=arr.length-1;
		int temp=0;
		for (int i = 0; i < arr.length/2; i++) {
			temp=arr[st];
			arr[st]=arr[end];
			arr[end]=temp;
			st++;
			end--;
		}
		return arr;
		
	}

}
