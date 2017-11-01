package test;

import java.util.*;
//{"O ne", "T w o", " Th ree ",};
//test
public class Main {
	 public static String [] list = {"O ne", "T w o", " Th ree ",};
	public static void main(String[] args) 
	{
		
		for( int i =0;i<list.length;i++) {
			String word = "";
			for(int u = 0; u<list[i].length();u++) {
				if(list[i].charAt(u)!=' ') {
				word += list[i].charAt(u);
				}
					
			}
				list[i] = word;
				

			
			

		}
		System.out.print(list[0]+list[1]+list[2]);

	}
}
