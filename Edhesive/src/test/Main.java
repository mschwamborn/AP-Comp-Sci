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
		
//	        int counter= 0;
	        
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
	        String word,name,tempword;
		 boolean bad = false;
	       Scanner sc = new Scanner(System.in);
		 word = sc.nextLine();
		 name = word.substring(0,word.indexOf(" "));

		 word = word.toUpperCase();
		 System.out.println("Results:");

		 if(word.contains(" ^^")) {
			 System.out.println("BAD");
			 bad = true;
		 }else if(word.contains(" QEY ")) {
				 System.out.println("BAD");
				 bad = true;
		 }else if(word.contains(" $ ")){
			 System.out.println("BAD");
			 bad = true;
		 }else {
			 System.out.print("CLEAN"); 
		 }
		 
		 
		 
		 if(bad) {
		 int qey = word.indexOf(" QEY ");
		 tempword = word;
		 int countQ = 0;
		 while (qey != -1) {
		     countQ++;
		     tempword = tempword.substring(qey+4);
		     qey = tempword.indexOf(" QEY ");
		     
		 }
		 int carott = word.indexOf(" ^^ ");
		 int countC = 0;
		 while (carott != -1) {
		     countC++;
		     tempword = word.substring(carott + 3);
		     carott = tempword.indexOf(" ^^ ");
		    
		 }
		 int dollar = word.indexOf(" $ ");
		 int countD = 0;
		 while (dollar != -1) {
		     countD++;
		     tempword = word.substring(dollar+ 2 );
		     dollar = tempword.indexOf(" $ ");
		     
		 }
		 
		 System.out.println(name + "\n^^: "+countC+"\nqey: "+countQ+"\n$: "+countD);
		 }
	}
	}

