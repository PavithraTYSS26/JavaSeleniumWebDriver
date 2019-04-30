package harsha.assignment.java;

public class FirstSecondSwap {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		temp=arr[2];
		arr[2]=arr[3];
		arr[3]=temp;
		temp=arr[4];
		arr[4]=arr[5];
		arr[5]=temp;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
