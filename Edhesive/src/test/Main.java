package test;

import java.util.*;

public class Main {
	
	static Scanner scan = new Scanner (System.in);

	 public static String [] strg;
	 //public static int [] ints = new int[3];
	public static void main(String[] args) 
	{
		System.out.print(printDecimal(2));
	

	
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
	

	
}
