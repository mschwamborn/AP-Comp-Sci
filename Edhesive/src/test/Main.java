package test;

import java.util.*;

public class Main {
	
	static Scanner scan = new Scanner (System.in);

	 public static String [] strg;
	 //public static int [] ints = new int[3];
	public static void main(String[] args) 
	{
		ArrayList<String> array = new ArrayList<String>();

		System.out.println("Please enter words, enter STOP to stop the loop.");
		while(1>0) {
			String data = scan.nextLine();
			if(data.equals("STOP"))
				break;
			array.add(data);
			
		}

		for (int i = 0; i <array.size();i++) {
		    if (array.get(i).indexOf('a')!= -1) {
		        System.out.println(array.get(i));
		    }
		}
		
		
		
	}
	
	public static int randomize(int min, int max) {
		int random  = (int)(Math.random() * (max-min) +min);
		return random;
	}
	public static int randomize(int max) {
		int random  = (int)(Math.random() * (max));
				return random;
	}
	public static double randomize(double min, double max) {
		double random  = (Math.random() * (max-min) +min);
				return random;
	}
	public static double randomize(double max) {
		double random  = (Math.random() * (max));
				return random;
	}
	public static int printDecimal(int n)
	{
		if(n<1)
			return 1;
		else
		return n+printDecimal(n-2)+printDecimal(n-3);
	}
	static void fun(int x){
		if(x>=1){      
			fun(x-1);   
			System.out.print(x); 
			}}

	
}
