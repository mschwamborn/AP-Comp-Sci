package test;


import java.util.*;


public class Class1 {
	
	    public static void main(String[] args) {
	    	//int one,two,three,four;
	    
	    	/*Scanner scan=new Scanner(System.in);
	    	/*Scanner sc=new Scanner(System.in);
	    	System.out.println("Please input a decimal number:");
	    	int two = (int)(sc.nextDouble()*100);
	    	int three = two/100*100;
	    	int four = two-three;
	    	System.out.println("Answer: " + four);*/
	    	//yg = (Double)the;
	    	
	    	/**int test1 = 1;
	    	int test2 = scan.nextInt();
	    	double averfage = ((double)(test1 + test2) )/2;
	    	System.out.println("Answer: " + average);
	    	int i = 3; // i is 3
	    	double d = (double) i; // d = 3.0*
	    	
	    	System.out.print("Please enter a three digit number:");
	    	one = scan.nextInt();
	    	two = one%10;
	    	three =((one-two)/10)%10;
	    	four = ((one-three)/100);
	    	System.out.print("Here are the digits:"+"\n"+four+"\n"+three+"\n"+two);*/
	    	latlong();
	    	
	    
	    	
	    	

	    	  
	    	
	    }

	    	public static void code() {
	    			
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

		    	webAv = (double) (web1+web2+web3)/3;
		    	focusAv = (double)(focus1+focus2)/2;
		    	overallAv= ((webAv*0.20)+(focusAv*0.30)+(critic1*0.50));
		    	System.out.println("Average website rating: "+ webAv );

		    	System.out.println("Average focus group rating: "+focusAv);

		    	System.out.println("Average movie critic rating: "+critic1);

		    	System.out.println("Overall movie rating: "+overallAv);

	    	}
	    	public static void code1(String[]arg){
	    		 int one,two,three,four;
	    	        Scanner scan=new Scanner(System.in);
	    		    	System.out.print("Please enter a three digit number:");
	    		    	one = scan.nextInt();
	    		    	two = one%10;
	    		    	three =((one-two)/10)%10;
	    		    	four = ((one-three)/100);
	    		    	System.out.print("Here are the digits:"+"\n"+four+"\n"+three+"\n"+two);
	    		    	//This is Just Question 2 
	    		    	//System.out.print("\n"+ four + "+"+three+"+"+two+"="+(four+three+two));
	    	}
	    	public static void math(){
	    		Scanner sc = new Scanner(System.in);
	    		double num1 = sc.nextDouble();
	    		double num2 = sc.nextDouble();
	    		double difference = (((num1 - num2)*1000));
	    		int one = (int)difference;
	    		double two = (double)one/1000;
	    		System.out.println(two+0.001);
	    	}
	    	public static void  time(){
	    		Scanner scan = new Scanner (System.in);
	    		int input;
	    		int year,month,day,hour,min,sec,input1;
	    		System.out.println("Seconds Since Unix Epoch:");
	    		input = scan.nextInt();
	    		year =  1970+input/31536000;
	    		input1= (input%31536000);
	    		month = input1/2592000;
	    		input = input%2628000;
	    		day = input /86400;
	    		input = input%86400;
	    		hour = input /3600;
	    		input = input%3600;
	    		min = input /60;
	    		sec = input%60;
	    		
	    		System.out.println("\nYear: "+year);
	    		System.out.println("Month: "+month);
	    		System.out.println("day: "+day);
	    		System.out.println("Hour: "+hour);
	    		System.out.println("Minute: "+min);
	    		System.out.println("Second: "+sec);
	    	}
/*    	public static void test(){
	    		Scanner sc = new Scanner (System.in);
	    		int year1,month1,day1,hour1,min1, year,month,day,hour,min,sec;
	    		System.out.println("Seconds Since Unix Epoch: ");
	    		sec = sc.nextInt();
	    		year1 = 31104000;
	    		year = (sec/year1)+1970;

	    		month1 = (sec%year1);
	    		month = (month1/2592000);

	    		day1 = (month1%2592000);
	    		day = (day1/86400);

	    		hour1 = (day1%86400);
	    		hour = (hour1/3600);

	    		min1 = (hour1%3600);
	    		min = (min1/60);

	    		sec = (min1%60);

	    		System.out.println("Year: " + year);
	    		System.out.println("Month: " + month);
	    		System.out.println("Day: " + day);
	    		System.out.println("Hour: " + hour);
	    		System.out.println("Min: " + min);
	    		System.out.println("Sec: " + sec);
	    	}*/
	    	public static void lab5() {
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
	    	public static void lab6() {
	    		Scanner sc = new Scanner(System.in);
	    		String word,hyphen;
	    		word = sc.nextLine();
	    		
	    		System.out.println(word);
	    		word = word.toUpperCase();
	    		System.out.println(word);
	    		hyphen = ((word.substring(0,word.indexOf(" ")))+"-"+(word.substring(word.indexOf(" ")+1,word.length())));
	    		System.out.print(hyphen);
	    	}
	    	public static void test() {
		Scanner sc = new Scanner(System.in);
//	            int input1,input2,count=0,mod;
//	            String even = "";
//	            System.out.println("Enter two numbers:");
//	            input1 = sc.nextInt();
//	            input2=sc.nextInt();
//	            count = input1;
//	            while(count<=input2){
//	               mod = count%2;
//	                if(mod==0){
//	                    even += Integer.toString(count)+" ";
//	                }
//	                count++;
//	            }
//	            
//	            System.out.println(even);
	    		int num = sc.nextInt();
	    		 int sum = 0;

	    		while ( num > 0) {
	    		    sum += num % 10;
	    		    num /= 10;
	    		}
	    		System.out.print(sum);
	    		
	    	}
	    	public static void latlong() {
				Scanner sc= new Scanner (System.in);
				int answer=1;
				double longitude1, latitude1, longitude2=0, latitude2=0, leastLat = 90, leastLong = 180;
				while(answer==1) {
				System.out.println("Please enter the latitude:");
				latitude1 = sc.nextDouble();
				System.out.println("Please enter the longitude:");
				longitude1 = sc.nextDouble();
				System.out.println("Would you like to enter another location?");
				answer = sc.nextInt();
				if((longitude1<=180&&longitude1>=-180)&&(latitude1<=90&&latitude1>=-90)) {
				if(longitude1>longitude2) {
					longitude2 = longitude1;
				}
				if (longitude1<leastLong) {
					leastLong = longitude1;
				}
				if(latitude1>latitude2) {
					latitude2=latitude1;
				}
				if(latitude1<leastLat) {
					leastLat=latitude1;
				}
				if(answer == 0) {
					answer = 0;
				}
				}
				}
				System.out.println("Farthest North: "+longitude2);
				System.out.println("Farthest South: "+leastLong);
				System.out.println("Farthest East: "+latitude2);
				System.out.println("Farthest West: "+leastLat);
			
	    	}
}
	    	


    
