package test;
import java.util.*;
public class WhileLoops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test();
	}
	public static void LoopRev() {
		int num = 10010;
		int space=0;
		String snum = Integer.toString(num);
		int count = 0;
		String output = "" ;
		int original = num;
		
		while(count< (snum.length())) {
			output += (num%10)+"";
			num  = num/10;
			count++;
		}
		while((output.charAt(0)=='0')) {
			if((output.charAt(0)=='0')) {
			output = output.substring(1);
		
		}
	}
	System.out.print(original + " reversed is "+ output);
	}
		
	}
	

