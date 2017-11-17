package test;

import java.util.*;
//{"O ne", "T w o", " Th ree ",};

public class Main {
	static Scanner scan = new Scanner (System.in);
	static boolean incorrectOrder;
	
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
		String merge = "";
		System.out.println("Enter the values for the first array, up to 10000 values, enter 'End' to quit");
		
		for(int i = 0; i<one.length;i++) {
			temp = sc.nextLine().toLowerCase();
			if(temp.equals("end")) {
				break;
			}
			one[i] = temp.substring(0,1).toUpperCase()+  temp.substring(1);
		}
		
		
		System.out.println("Enter the values for the second array, up to 10000 values, enter 'End' to quit");
		
		for(int i =0;i <two.length;i++) {
			temp = sc.nextLine().toLowerCase();
			if(temp.equals("end")) {
				break;
			}
			two[i] = temp.substring(0,1).toUpperCase()+  temp.substring(2)+" ";
		}
		for(int i=0;i<one.length;i++) {
			if(one[i].equals(null)) {
				break;
			}
			else {
				System.out.print(one[i]+" ");
			}
		
		}
		System.out.println(one[0]);
		
	}
	
	
	public static void arrayEntry() {
		/*String[] arrayOne = new String[10000];
		String[] arrayTwo = new String[10000];
		
		arrayOne = entryCode(1);
		arrayTwo = entryCode(2);
		*/
		merge(entryArray(1), entryArray(2));
	}
	
//ENTRYCODE
	public static String[] entryArray(int arrayNum) {
		boolean continue_entry = true; //flag varible
		int elementNum = 0;
		String text = null;
		String last_entry = "";
		String[] array = new String[10000];
		if(arrayNum == 1) {
			text = "first";
		}
		else if(arrayNum == 2) {
			text = "second";
		}
		
		
		System.out.println("Enter the values for the " + text + " array, up to 10000 values, enter 'End' to quit");
		while(continue_entry) {
			String entry = scan.nextLine(); //scans for name
			array[elementNum] = entry; //sets entry to it's element in the array
			
			if(entry.toUpperCase().compareTo("END")==0) { //If entry is less than last entry or if is "END"
				continue_entry = false;
			}
			if(entry.compareTo(last_entry)<0) {
				incorrectOrder = true;
			}
			last_entry = entry;
			elementNum++;
		}
		
		
		
		return array;
	}
	
//MERGE
	public static void merge(String [] arrayOne, String [] arrayTwo) {
		String[] mergedArray = new String[20000]; //20,000 because if arrayOne has 10,000 and arrayTwo has 10,000.  Combined will be 20,000
		int elementNumOne = 0;
		int elementNumTwo = 0;
		int elementNumMerged = 0;
		
		System.out.println("BEFORE MERGE");
		//TODO review how compareTo works, does it compare this to var to var to this
		while(elementNumOne<=10000 && elementNumTwo<=10000) {
			if(arrayOne[elementNumOne].compareTo(arrayTwo[elementNumTwo])<=0 ) {
				System.out.println("INSIDE IF");
				mergedArray[elementNumMerged] = arrayOne[elementNumOne];
				elementNumMerged++;
				elementNumOne++;
			}
			else{
				System.out.println("INSIDE ELSE");
				mergedArray[elementNumMerged] = arrayTwo[elementNumOne];
				elementNumMerged++;
				elementNumTwo++;
			}
		}
		System.out.println("REACHED PRINTING");
		/*print(arrayOne, 1);
		print(arrayTwo, 2);
		print(mergedArray, 3);*/
	}
	
	
//PRINT
	public static void print(String [] array, int arrayNum) { //This method prints out the merged array
		String text = null;
		if(arrayNum == 1) {
			text = "First";
		}
		else if(arrayNum == 2) {
			text = "Second";
		}
		else if(arrayNum == 3) {
			text = "Merged";
		}
		else {
			System.out.println("ERROR - arrayNum not 1 or 2 or 3");
		}
		
		System.out.println();
		System.out.println(text + " Array");
		for(int i = 0; i < array.length; i++) {
			if(array[i] != null) { //checks if there is something in the array element
				if(i==array.length-1) //prints the last element without a space at the end
					System.out.print(array[i]);
				else
					System.out.print(array[i] + " "); //prints element with one space at the end
			}
		}
	}

	
}
