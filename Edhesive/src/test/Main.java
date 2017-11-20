package test;

import java.util.*;
//{"O ne", "T w o", " Th ree ",};

public class Main {
	static Scanner scan = new Scanner (System.in);
	static boolean incorrectOrder1 = false;
	static boolean incorrectOrder2 = false;
	
	 public static String [] strg;
	 //public static int [] ints = new int[3];
	public static void main(String[] args) 
	{int [] ints = {55,2,15,6};
		 
	//System.out.println(sumEven(ints));
	assignment6();
	
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
	
	public static void assignment6() {
		Scanner sc = new Scanner(System.in);
		String temp = "";
		String [] one = new String[10000]; 
		String[] two = new String[10000];
		String text = null;
		String last = temp;
		System.out.println("Enter the values for the first array, up to 10000 values, enter 'End' to quit");
		
		for(int i = 0; i<one.length;i++) {
			temp = sc.nextLine().toLowerCase();
			if(temp.equals("end")) {
				break;
			}
			one[i] = temp.substring(0,1).toUpperCase()+  temp.substring(1);
			if(temp.compareTo(last)<0) {
				incorrectOrder1 = true;
				
			}
			last = temp;
		}
		
		
		System.out.println("\nEnter the values for the second array, up to 10000 values, enter 'End' to quit");
		last ="";
		for(int i =0;i <two.length;i++) {
			temp = sc.nextLine().toLowerCase();
			if(temp.equals("end")) {
				break;
			}
			two[i] = temp.substring(0,1).toUpperCase()+  temp.substring(1);
			if(temp.compareTo(last)<0) {
				incorrectOrder1 = true;
				
			}
			last = temp;
		}
		
		one  =deletedArray(one);
		
		two  =deletedArray(two);
		String[] mergedNull = new String[deletedArray(one).length+deletedArray(two).length]; 
		int x = 0;
		int y = 0;
		int z = 0;
		int flag =0;
	
		
		
		if(!incorrectOrder1||!incorrectOrder2) {
		while(z<=(one.length+two.length)-1&&flag==0) 
		{
			
			if(x!=one.length&&one[x].compareTo(two[y])<=0) 
			{
				
				mergedNull[z] = one[x];
				/*System.out.println(x);
				System.out.println(y);
				System.out.println(z);
				System.out.println(flag);
				System.out.println(Arrays.toString(mergedNull));
				System.out.println(" ");*/
				
				if(x==one.length-1)
					flag =1;
				
				if(x<one.length-1) 
					x++;
				if(z<=(one.length+two.length)-1)
					z++;
			}	
				
				
			
			if(y!=two.length&&one[x].compareTo(two[y])>0) 
			{
				
				mergedNull[z] = two[y];
				/*System.out.println(x);
				System.out.println(y);
				System.out.println(z);
				System.out.println(flag);
				System.out.println(Arrays.toString(mergedNull));
				System.out.println(" ");*/
				
				if(y==two.length-1)
					flag =2;

				if(y<two.length-1) 
				    y++;
				if(z<=(one.length+two.length)-1)
					z++;
			}
			
			
			}
	
//		    System.out.println("Flag : "+flag);
			if(flag==1) 
			{
				while(y<=two.length-1) 
				{
					mergedNull[z] = two[y];
					z++;
					y++;
				}
			}
			if(flag==2) 
			{
				while(x<=one.length-1) 
				{
					mergedNull[z] = one[x];
					z++;
					x++;
				}
			}
				
		}	
			
			
			
		
		
		
		System.out.println("\n\nFirst Array");
		for(int i =0;i <one.length;i++) { 
			if(i <one.length-1)
			System.out.print(orderArray(deletedArray(one))[i]+" ");
			else
				System.out.print(orderArray(deletedArray(one))[i]);

		}
		System.out.println("\n\nSecond Array");
		for(int i =0;i <two.length;i++) {
			if(i<two.length-1)
			System.out.print(orderArray(deletedArray(two))[i]+" ");
			else
				System.out.print(orderArray(deletedArray(two))[i]);

		}
		if(incorrectOrder1||incorrectOrder2)
		System.out.print("\n\nError: Arrays not in correct order");
		else {
			System.out.println("\n\nMerged Array");
			for(int i =0;i <deletedArray(mergedNull).length;i++) {
				if(i<mergedNull.length-1)
					System.out.print(deletedArray(mergedNull)[i]+" ");
					else
						System.out.print(deletedArray(mergedNull)[i]);

				
				
				
			}
		}
			
	}
	
	public static String [] deletedArray(String [] array ) {
		int numOfNum = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == null) {
				numOfNum++;
			}
		}
		
		
		String[] newArray = new String [(array.length-numOfNum)];
		int newArrayIndex = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] != null) {
				newArray[newArrayIndex]=array[i];
				newArrayIndex++;
			}
		}
		
		return newArray;
	}
	public static String [] orderArray(String [] array ) {
		
		String[] arrayR = new String [array.length];
		String[] arrayC = new String [array.length];
		arrayR[0]=array[0];
		arrayC = arrayR.clone();
		for(int i = 1; i < array.length; i++)
		{
			String compare = array[i];
			if(i<=array.length-1) 
			{
				
				int u =0;
				while(u<arrayR.length) {
	
					
					
					if(arrayR[u]==null) 
					{
						arrayR[u]  = compare;
						arrayC = arrayR.clone();
						
					break;
					}
					
					if(compare.compareTo(arrayR[u])<=0) 
					{
						
						arrayR[u] = compare;
						
						for(int q =u;q<arrayR.length;q++)
						{
							
							
							if(arrayC[q]==null) {
								

								break;
							}
							if(u<arrayR.length-1) 
							{
								arrayR[u+1] = arrayC[q];
								
								u++;
							}
												
						
						}
						arrayC = arrayR.clone();
						 break;
					}
					
					else
					{
						u++;
						
					
					}
					
					
				}
				
				
				
			}
			
		}
		
		
		return arrayR;
	}
	public static void insertValue(int[] array, int data, int place) {
		for( int i= array.length-1; i>place;i--) {
			array[i] =array[i-1];
		}
		 array[place]  =data;
	}
	
	
	

	
}
