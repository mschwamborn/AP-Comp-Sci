package test;

public class ForLoopPractice {

	public static void main(String[] args) {
		
		practice3();
		
		
		
		
	}
	public static void practice1() {
		for(int i=1;i<=5;i++ ) {
			
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void practice2() {
		for(int i=1;i<=10;i++) {
			System.out.print((i*i)+" ");
		}
	}
	public static void practice3() {
		for(int i=1;i<=4;i++) {
			System.out.println((i+" squared = "+i*i));
		}
		System.out.print("I love for loops!");
	}
	
	

}
