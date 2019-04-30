package srinidhi.sixteen.java.programs;
import java.util.Scanner;
public class RightShiftArray {

	

	
		public static void main(String[] args) {
			int[] array = new int[10];
			System.out.println("Enter 10 numbers");
			Scanner input = new Scanner(System.in);
			for (int i = 0; i < array.length; i++) {
				array[i] = input.nextInt();
			}
			System.out.println("Original array is:");
			printArray(array);
			System.out.println();
			System.out.println("Left or Right");
			String st = input.next();
	System.out.print("Enter an amount by which to rotate the array: ");
			int amount = input.nextInt();
			if (st.equals("Left")) {
				shiftLeft(array, amount);
				System.out.print("Resulted Array is: ");
				printArray(array);
			} else if (st.equals("Right")) {
				shiftRight(array, amount);
				System.out.print("Resulted Array is: ");
				printArray(array);
			}
		}

		public static void shiftLeft(int[] array, int amount) {
			for (int j = 0; j < amount; j++) {
				int a = array[0];
				int i;
				for (i = 0; i < array.length - 1; i++)
					array[i] = array[i + 1];
				array[i] = a;
			}
		}

		public static void shiftRight(int[] array, int amount) {
			for (int j = 0; j < amount; j++) {
				int a = array[array.length - 1];
				int i;
				for (i = array.length - 1; i > 0; i--)
					array[i] = array[i - 1];
				array[i] = a;
			}
		}

		public static void printArray(int[] array) {
			for (int x = 0; x < array.length; x++) {
				System.out.print(array[x] + " ");
			}
			System.out.println();
		}
	

	}



