package test;

public class WhileLoops {
	
	public static void main(String[] args) 
	{
		LoopDivisor();
	}
	
	public static void LoopDigit()
	{
		int num = 23;
		int count = 0;
		int digits = num;
		while (num >0) {
			count++;
			num = num/10;
		}
		System.out.println(digits + " contains "+ count+" digits");
	}
	
	public static void LoopAdd() 
	{
		int num = 234, sum = 0;
		int digits = num;
		while (num>0) {
			sum += (num%10);
			num = num/10;
		}
		System.out.print(sum+" is the sum of the digits of "+digits);
	}
	public static void LoopAvg() {
		int num = 9005;
		double sum = 0;
		int digits = 0, original = num;;
		while (num>0) {
			sum += (num%10);
			num = num/10;
			digits++;
		}
		System.out.print(original+" has a digit average of "+(sum/digits));
	}
	
	public static void LoopDivisor() {
		 int num = 45, count = 1;
		 String divisors = "";
		 
		 while(count<num) {
			 if(num%count==0) {
				 divisors += count+ " " ;
				
			 }
			 count++;
	}
		 System.out.print(num + " has divisors "+ divisors);
	}
}
