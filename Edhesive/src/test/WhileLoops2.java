package test;
import java.util.*;
public class WhileLoops2 {

	public static void main(String[] args) {
		
		LoopPerfect();
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
		public static void LoopPerfect() {
			 int num = 496, count = 1,Idivisors=0,devide=0;
			 String Sdivisors = "";
			 
			 while(count<num) {
				 if(num%count==0) {
					 Sdivisors += count+ " " ;
					 devide = (devide+count);
					Idivisors++;
				 }
				 count++;
		}
			 if(devide==num) {
			 System.out.print(num + " is perfect.");
			 }
			 else {
				 System.out.print(num+" is not perfect.");
		}
		}
	}
	

