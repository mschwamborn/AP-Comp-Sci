package test;

import java.util.Arrays;
import java.util.Scanner;

public class ParameterLabs {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		//ArrayFun();
		//WordFun();
		TriangleFun();
	}

	public static void ArrayFun() {
		int[] myArr = new int[] {2, 4, 6, 8, 10, 12, 8, 16, 8, 20, 8, 4, 6, 2, 2};
		
		System.out.println("Original array : "+Arrays.toString(myArr));
		System.out.println();
		System.out.println("Sum of 0-3: " + sum(0, 3, myArr));
		System.out.println("Sum of 2-7: " + sum(2, 7, myArr));
		System.out.println("Sum of 1-8: " + sum(1, 8, myArr));
		System.out.println("Sum of 5-9: " + sum(5, 9, myArr));
		System.out.println();
		System.out.println("Count of 2s: " + countOf(2, myArr));
		System.out.println("Count of 8s: " + countOf(8, myArr));
	}
	private static int sum(int start, int stop, int[] arr) {
		int sum = 0;
		for(int i = start; i < stop; i++) {
			sum += arr[i];
		}
		return sum;
	}
	private static int countOf(int num, int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			count += (arr[i] == num ? 1 : 0);
		}
		return count;
	}
//WordFun
	public static void WordFun() {
		System.out.print("Enter the word to display :: ");
		String word = scan.nextLine();
		System.out.print("Enter the times to display :: ");
		int total = scan.nextInt();
		for(int i = 0; i<total; i++)
			System.out.println(word);
		
	}
//TriangleFun	
	public static void TriangleFun() {
		System.out.print("Enter a word :: ");
		String word = scan.nextLine();
		for(int i =0; i< word.length();i++) {
			for(int k = 0; k <i+1;k++) {
				for(int u =0; u<i+1;u++) 
				System.out.print(word.substring(u, u+1));
			}
			System.out.println();
		}
		System.out.print("\nDo you wan to enter more sample input? ");
		String ans = scan.nextLine();
		if(ans.equals("y")) {
			TriangleFun();
		}

	}
}
