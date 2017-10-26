package test;

import java.util.*;

public class Main {
	public static void main(String[] args) 
	{
		String list [] = {"every", "nearing", "checking", "food", "stand", "value"};
		
		String word = null;
		for (int i=0; i < list.length; i++)
		{
			word = new StringBuilder(list[i]).reverse().toString();
			System.out.println(word);
		

	}
}
}