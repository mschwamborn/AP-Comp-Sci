package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//test test
//		String name;
//		int one, two, three;
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Welcome. What is your name?");
//		name = sc.nextLine();
//		System.out.println("Hello "+name+". Try your best to crack the code!");
//		System.out.println("\nPHASE 1");
//		System.out.println("Enter a number:");
//		one = sc.nextInt();
//		if(one==3) {
//			System.out.println("Correct!");
//			System.out.println("\nPHASE 2");
//			System.out.println("Enter a number:");
//			two = sc.nextInt();
//			if(two==1||(two>=33&&two<=100)) {
//				System.out.println("Correct!");
//    			System.out.println("\nPHASE 3");
//    			System.out.println("Enter a number:");
//    			three = sc.nextInt();
//    			if(three == Math.abs(three)&&(three%3==0||three%7==0)) {
//    				System.out.println("Correct!");
//	    			System.out.println("You have cracked the code!");
//    			}
//    			else
//    			{
//    				System.out.println("Sorry, that was incorrect!\r\n" + 
//	    					"Better luck next time!");
//    			}
//    				
//    				
//			}
//			else {
//				System.out.println("Sorry, that was incorrect!\r\n" + 
//    					"Better luck next time!");
//			}
//		} else {
//			System.out.println("Sorry, that was incorrect!\r\n" + 
//					"Better luck next time!");
//		}
		 String word;
//	        int counter= 0;
	        Scanner sc = new Scanner(System.in);
//	        System.out.println("Enter a string:");
//	        word = sc.nextLine();
//	        while(counter<word.length()){
//	        	
//	        	for(int c=0;c<counter;c++){
//	        	
//	        	
//	            System.out.print("\t");
//	        	}
//	        	System.out.println(word.charAt(counter));
//
//	            counter++;
//	        }
		 word = sc.nextLine();
		 if(word.contains(" ^^ ")) {
			 System.out.print("BAD");
		 }else if(word.contains(" qey ")||word.contains(" Qey ")||(word.contains(" QEy ")||word.contains(" QEY ")||word.contains(" QeY ")||word.contains(" qEy ")||word.contains(" qeY "))) {
				 System.out.print("BAD");
		 }else if(word.contains(" $ ")){
			 System.out.print("BAD");
		 }else {
			 System.out.print("CLEAN"); 
		 }
		 
	}
	}

