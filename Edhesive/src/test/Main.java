package test;

import java.util.*;
//{"O ne", "T w o", " Th ree ",};

public class Main {
	
	 public static String [] strg;
	 //public static int [] ints = new int[3];
	public static void main(String[] args) 
	{int [] ints = {1,2,3};
		 
insertValue(ints,1,2);

	
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
	
	public static void insertValue(int[] array, int data, int place) {
		for( int i= array.length-1; i>place;i--) {
			array[i] =array[i-1];
		}
		 array[place]  =data;
	}

	

	
}
