package test;

import java.util.Arrays;

public class arrayOdd {

	public static void main(String[] args) {
		int [] Array1 = {2,4,6,8,10,12,14};
		int [] Array2 = {2,3,4,5,6,7,8,9};
		int [] Array3 = {2,10,20,21,23,24,40,55,60,61};
		odd(Array2);
		even(Array1);
		odd(Array2);
		even(Array2);
		odd(Array2);
		even(Array2);
	}
	
	public static void odd(int[] array) {
		System.out.println("Odds - "+Arrays.toString(deletedArray(array,1)));
		
	}
	
	public static void even(int[] array) {
		System.out.println("Evens - "+Arrays.toString(deletedArray(array,0)));
	}
	
	
	public static int [] deletedArray(int [] array, int goodNum) {
		int numOfNum = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i]%2 ==goodNum ) {
				numOfNum++;
			}
		}
		
		
		int[] newArray = new int [(array.length-numOfNum)];
		int newArrayIndex = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i]%2 ==goodNum&&array[i]!=0) {
				
				newArray[newArrayIndex]=array[i];
				//newArrayIndex++;
			}
		}
		
		return newArray;
	}
	

}
