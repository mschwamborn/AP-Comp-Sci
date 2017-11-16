package test;

import java.util.*;

public class arrayFun {

	public static void main(String[] args) {
		
		int[] array1 = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
		int[] array2 = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};
		int start1 =3; 
		int stop1 =6; 
		int start2 =2; 
		int stop2 =9; 
		int stop3 =16; 
		System.out.println(Arrays.toString(array1));
		System.out.println("sum of spots 3-6 = "+arrayFun.arraySum(array1,start1,stop1));
		System.out.println("sum of spots 2-9 = "+arrayFun.arraySum(array1,start2,stop2));
		
		System.out.println("\n # of 4s  = "+arrayFun.numOfNum(array1, 4));
		System.out.println(" # of 9s  = "+arrayFun.numOfNum(array1, 9));
		System.out.println(" # of 7s  = "+arrayFun.numOfNum(array1, 7));
		
		System.out.println("\nnew array with all 7s removed = "+Arrays.toString(arrayFun.deletedArray(array1,7)));
		System.out.println(" # of 7s  = "+arrayFun.numOfNum(arrayFun.deletedArray(array1,7), 7));
		
		System.out.println("\n\n"+Arrays.toString(array2));
		System.out.println("sum of spots 3-16 = "+arrayFun.arraySum(array2,start1,stop3));
		System.out.println("sum of spots 2-9 = "+arrayFun.arraySum(array2,start2,stop2));
		
		System.out.println("\n # of 0s  = "+arrayFun.numOfNum(array2, 0));
		System.out.println(" # of 3s  = "+arrayFun.numOfNum(array2, 3));
		System.out.println(" # of 7s  = "+arrayFun.numOfNum(array2, 7));
		
		System.out.println("\nnew array with all 7s removed = "+Arrays.toString(arrayFun.deletedArray(array2,7)));
		System.out.println(" # of 7s  = "+arrayFun.numOfNum(arrayFun.deletedArray(array2,7), 7));
		
		
		
	
		
		
		
	}
	
	public static int arraySum(int[] array, int start, int stop) {
		int sum=0;
		for(int i = start; i<array.length&&i<=stop;i++)
			sum+=array[i];
		
		
		return sum;
		
	}
	public static int numOfNum(int[] array, int search) {
		int count = 0;
		for(int i = 0; i<array.length;i++) {
			if(array[i]==search) {
				count++;
			}
		}
		
		
		return count;
		
	}
	public static int [] deletedArray(int [] array, int badNum) {
		int numOfNum = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == badNum) {
				numOfNum++;
			}
		}
		
		
		int[] newArray = new int [(array.length-numOfNum)];
		int newArrayIndex = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] != badNum) {
				newArray[newArrayIndex]=array[i];
				newArrayIndex++;
			}
		}
		
		return newArray;
	}
	
	

}


