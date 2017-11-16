package test;

import java.util.*;
//{"O ne", "T w o", " Th ree ",};

public class Main {
	
	 public static String [] strg;
	 //public static int [] ints = new int[3];
	public static void main(String[] args) 
	{int [] ints = {55,2,15,6};
		 
	System.out.println(sumEven(ints));
	
	}
	 
    

	
	
	
	
	public static void reverse(int[] array) {
		int length = array.length;
		int[] temp = new int [length];
		int count = 0;
		
			for(int v = array.length-1; v >=0; v-- ) {
			 temp[v] = array[v];
			 
			 
			}
			for(int v = array.length-1; v >=0; v-- ) {
				 array[v] = temp[count];
				 
				 count++;
				}
			System.out.print(array[0]+" "+array[1]+" "+array[2]+" ");
			
		}
	
	public static double average(int [] array) {
		double avg = 0.0;
		int sum =0;
		for(int i =0;i<array.length;i++) {
			
			sum+=array[i];
			avg = (double)sum/array.length;
		}
	
		return avg;
	}
	
	public static int findMax(int [] array) {
		int largest =0;
		for(int i =0;i<array.length;i++) {
			if(array[i]>largest) {
				largest = array[i];
			}
			
			
		}
	
		return largest;
	}
	public static int findMin(int [] array) {
		int smallest =99999;
		for(int i =0;i<array.length;i++) {
			if(array[i]<smallest) {
				smallest = array[i];
			}
			
			
		}
		
		return smallest;
	}
	public static int sumEven(int [] array) {
		int sum =0;
		for(int i =0;i<array.length;i++) {
			if(array[i]%2==0) {
				sum += array[i];
			}
			
			
		}
		
		return sum;
	}
	public static boolean allPositive(int [] array) {
		boolean pos = true;
		for(int i =0;i<array.length;i++) {
			if(array[i]<=0) {
				pos = false;
				break;
			}
			
			
		}
		
		return pos;
	}
	
	
	

	
}
