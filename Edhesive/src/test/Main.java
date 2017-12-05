package test;

import java.util.*;

public class Main {
	
	static Scanner scan = new Scanner (System.in);

	 public static String [] strg;
	 //public static int [] ints = new int[3];
	public static void main(String[] args) 
	{
		ArrayList<String> laundry = new ArrayList<String>();

		laundry.add("shirt");
		laundry.add("sock");
		laundry.add("sock");
		laundry.add("sweater");
		laundry.add("shorts");
		laundry.remove("sock");

		System.out.println(laundry);
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
