package test;
import java.util.*;


public class Test {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		test();
		//HHIII
			

		
	}
	
	public static void math() {
		System.out.println((int)(Math.random()*20)+41);//random number between 0 and 1(not including one) 
		System.out.print(Math.abs(20-50));//Absolute Value Between two numbers
		
	}
	
	public static void movie() {
		Scanner sc = new Scanner(System.in);

		int web1,web2,web3;

		Double focus1, focus2,critic1;

		Double webAv, focusAv, overallAv;

		System.out.print("Please enter ratings from the movie review website.");

		web1=sc.nextInt();

		web2=sc.nextInt();

		web3=sc.nextInt();

		System.out.print("Please enter ratings from the focus group.");

		focus1=sc.nextDouble();

		focus2=sc.nextDouble();

		System.out.print("Please enter the average movie critic rating.");

		critic1=sc.nextDouble();

		webAv= (double)  (web1+web2+web3)/3;

		focusAv = (double)(focus1+focus2)/2;

		overallAv= ((webAv*0.20)+(focusAv*0.30)+(critic1*0.50));

		System.out.println("\nAverage website rating: "+ webAv );

		System.out.println("Average focus group rating: "+focusAv);

		System.out.println("Average movie critic rating: "+critic1);

		System.out.println("Overall movie rating: "+overallAv);
	}

	public static void tes2t() {
		Scanner sc = new Scanner(System.in);
		
		/*double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double difference = ((double)1000*(num1 - num2))/1000;
		
		System.out.println(difference);*/
		String name = sc.nextLine();
		String nameFirst = name.substring(0,name.indexOf(' '));
		int space = name.indexOf(' ');
		String nameLast = name.substring(space+1, name.length());
		System.out.print(nameFirst+" \n"+nameLast);
	}
	

	public static void test1() {
		
		
		
		          Scanner sc  = new Scanner(System.in);
				        int one,two;
				        System.out.println("Enter an Integer:");
				        one = sc.nextInt();
				        two = sc.nextInt();
				     
				        
				        if(one >two){
				            System.out.print(one);
				        }
				        else if(two >one){
				            System.out.println(two);
				        }
				        else{
				            System.out.print("EQUAL");
				        }
				        
				        
		    }
		   
	public static void ed() { 	    
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first octet:");
        int input1 = sc.nextInt();
        System.out.println("Please enter the second octet:");
        int input2 = sc.nextInt();
        System.out.println("Please enter the thrid octet:");
        int input3 = sc.nextInt();
        System.out.println("Please enter the four octet:");
        int input4 = sc.nextInt();
        if(input1<0||input1>255){
            System.out.println("Octet 1 is incorrect.");
        }
         if(input2<0||input2>255){
            System.out.println("Octet 2 is incorrect.");
        } if(input3<0||input3>255){
            System.out.println("Octet 3 is incorrect.");
        } if(input4<0||input4>255){
            System.out.println("Octet 4 is incorrect.");
        }
        if(!(input1<0||input1>255)&&!(input2<0||input2>255)&&!(input3<0||input3>255)&&!(input4<0||input4>255)){
            System.out.print("IP Address: "+input1+"."+input2+"."+input3+"."+input4);
        }
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
			
			
			public static void test() {
				Scanner sc = new Scanner(System.in);
				int length,num;
				System.out.println("How many integers would you like to enter?");
				 length = sc.nextInt();
				
				int[] array = new int[length];
				for(int spot=0;spot<length;spot++) {
					System.out.println("Please Enter your number:");
					num=sc.nextInt();
					array[spot]=num;
				} 
				System.out.println("\nYour numbers are: ");
				for(int spot=0;spot<length;spot++) {
					
					System.out.print(array[spot]+" ");
					
					
				}
				
			}
}

	
	

