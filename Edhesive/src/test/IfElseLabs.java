package test;
import java.util.*;

public class IfElseLabs {
	




		public static void main(String[] args) {

			// TODO Auto-generated method stub
			
				

			
		}
		
		
		
		
			
		
		public static void lab1() {
			int one,two,largest,smallest;
			 
			one = 50;
			two=6;
			largest =0;
			smallest = 0;
			
			
			
			System.out.println(one+" -- "+two);
			if(one>two) {
				largest = one;
				smallest = two;
			}
			else{
				largest = two;
				smallest = one;

			}
			System.out.println("largest == "+largest+"\n"+"smallest == "+smallest);
		}
			
		public static void lab2() {
			String one = "hello";
			String two = "goodbye";
			
			if(one.equals(two)) {
				System.out.println(one+" does have the same letters as "+two);
				
			}
			if(!one.equals(two)) {
				System.out.println(one+" does not have the same letters as "+two);

			}
		}
		
		public static void lab3() {
			String one = "one";
			String two = "two";
			
			int result = one.compareTo(two);
			
			if(result <0) {
				System.out.println(one+" should be placed before  "+two);
				
			}
			if(result >0) {
				System.out.println(one+" should be placed after  "+two);

			}
			//System.out.println(result);
		}
		public static void lab4() {
			Scanner sc = new Scanner(System.in);
			String SSnum = sc.nextLine();
			String one,two,three;
			int oneI,twoI,threeI, dash1,dash2;
			
			dash1 = SSnum.indexOf("-");
			dash2 =  SSnum.lastIndexOf("-");
			 
			one = SSnum.substring(0, dash1);
			two = SSnum.substring((dash1+1), dash2);
			three = SSnum.substring((dash2+1), SSnum.length());
			
			oneI = Integer.parseInt(one);
			twoI = Integer.parseInt(two);
			threeI = Integer.parseInt(three);
			
			System.out.println("SS# "+SSnum+" has a total of "+(oneI+twoI+threeI));
		}
		public static void lab5() {
			
			Scanner sc = new Scanner (System.in);
			String one = sc.nextLine();
			String two = sc.nextLine();
			
			if(one.length()==two.length()) {
				System.out.println(one+" has the same # of letters as "+two);
			}
			if(one.length()!= two.length()) {
				System.out.println(one+" does not has the same # of letters as "+two);
			}
		}
		public static void lab6() {

			Scanner sc = new Scanner (System.in);

			String one, two;

			one = sc.nextLine();

			two = sc.nextLine();

			if(one.charAt(0)==two.charAt(0)) {

			System.out.println(one+" has the same first letter as "+two);

			}

			else {

			System.out.println(one+" does not have the same first letter as "+two);

			}

			}

			public static void lab7() {

			Scanner sc = new Scanner(System.in);

			String word,hyphen;

			word = sc.nextLine();

			System.out.println(word);

			word = word.toUpperCase();

			System.out.println(word);

			hyphen = ((word.substring(0,word.indexOf(" ")))+"-"+(word.substring(word.indexOf(" ")+1,word.length())));

			System.out.print(hyphen);

			}
				public static void TestHW() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter one string that contains city and state and zipcode.");
				String input = sc.nextLine();
				String city = input.substring(0, input.indexOf(","));
				String state = input.substring(input.indexOf(" ")+1,input.indexOf(";"));
				String zip = input.substring(input.lastIndexOf(" ")+1);
				System.out.println(city+"\n"+state+"\n"+zip);
				}
	}

		
		



