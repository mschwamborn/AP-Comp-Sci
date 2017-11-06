package test;

import java.util.*;
//{"O ne", "T w o", " Th ree ",};

public class Main {
	
	 
	public static void main(String[] args) 
	{
		
		monthDays(7);
		
	}
	
    

	
	public static void monthDays(int num)
	{
	   String months[] = {"30","28","31","30","31","30","31","31","30","31","30","31"};
	   String selMonth = months[num-1];
	   System.out.println(selMonth);
	}
	
}
