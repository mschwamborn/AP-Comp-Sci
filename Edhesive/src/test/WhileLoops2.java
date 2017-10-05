package test;

public class WhileLoops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LoopRev();
	}
	public static void LoopRev() {
		int num = 9005;
		int rev = 0;
		String snum = Integer.toString(num);
		int count = 0;
		String output = "" ;
		int original = num;
		
		while(count< (snum.length())) {
			output += (num%10)+"";
			num  = num/10;
			count++;
		}
		if((output.charAt(0)==48))
		
		System.out.print(original + " reversed is "+ output);
	}

}
