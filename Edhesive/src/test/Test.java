package test;
import java.util.*;
 


public class Test extends Shortcuts {
	
	

	public static void main(String[] args) {
//		s.Scanner();
//		 s.PrintScan();
//		 s.IntArray(10);
//		 s.FillIntArray();
//		 Test
		
		String a = "applepie";
	    String b = "apple";
	    System.out.print(b.compareTo(a));
	    //System.out.print( mystery(18,10));
	}
	public static int mystery(int x, int y)      
	{
	  if (x == 0)
	    return y;
	  else
	    return mystery(y % x, x);
	}
	
}
	
	

