package test;


import java.util.*;
 

public class Classwork {
	static Scanner scan = new Scanner (System.in);

	    public static void main(String[] args)
	    {
	    	
	    	assignment6();
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

	    	sc.close();
	    	}
	    	public static void code1(){
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
//	            HEy
//	            System.out.println(even);
	    	
	    		
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
	    	public static void CrackCode() {
	    		String name;
	    		int one, two, three;
	    		Scanner sc = new Scanner (System.in);
	    		System.out.println("Welcome. What is your name?");
	    		name = sc.nextLine();
	    		System.out.println("Hello "+name+". Try your best to crack the code!");
	    		System.out.println("\nPHASE 1");
	    		System.out.println("Enter a number:");
	    		one = sc.nextInt();
	    		if(one==3) {
	    			System.out.println("Correct!");
	    			System.out.println("\nPHASE 2");
	    			System.out.println("Enter a number:");
	    			two = sc.nextInt();
	    			if(two==1||(two>=33&&two<=100)) {
	    				System.out.println("Correct!");
		    			System.out.println("\nPHASE 3");
		    			System.out.println("Enter a number:");
		    			three = sc.nextInt();
		    			if(three == Math.abs(three)&&(three%3==0||three%7==0)) {
		    				System.out.println("Correct!");
			    			System.out.println("You have cracked the code!");
		    			}
		    			else
		    			{
		    				System.out.println("Sorry, that was incorrect!\r\n" + 
			    					"Better luck next time!");
		    			}
		    				
		    				
	    			}
	    			else {
	    				System.out.println("Sorry, that was incorrect!\r\n" + 
		    					"Better luck next time!");
	    			}
	    		} else {
	    			System.out.println("Sorry, that was incorrect!\r\n" + 
	    					"Better luck next time!");
	    		}

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
	    	public static void TempAverageArray() {
	    				Scanner sc = new Scanner(System.in);
	    				int length,num,sum=0;
	    				System.out.println("How many tempratures would you like to enter?");
	    				 length = sc.nextInt();
	    				
	    				int[] array = new int[length];
	    				for(int spot=0;spot<length;spot++) {
	    					System.out.println("Please Enter the temp:");
	    					num=sc.nextInt();
	    					array[spot]=num;
	    					sum+=num;
	    				} 
	    				System.out.println("\nYour numbers are: ");
	    				
	    				for(int spot=0;spot<length;spot++) {
	    					
	    					System.out.print(array[spot]+" ");
	    					
	    					
	    				}
	    				System.out.println("\nThe average is: \n" + ((double)sum/array.length));
	    		
	    			}
	    	public static void groceriesList() {
	    				Scanner sc=new Scanner(System.in);
	    				int length;
	    				String[] list;
	    			}
	   		public static void ntes() {
	    				System.out.print(8/5*2);
	    			}
	    	public static void AlienMessage() {
	    				 String word,name,tempword;
	    				 boolean bad = false;
	    			       Scanner sc = new Scanner(System.in);
	    				 word = sc.nextLine();
	    				 name = word.substring(0,word.indexOf(" "));

	    				 word = word.toUpperCase();
	    				 System.out.println("Results:");

	    				 if(word.contains(" ^^ ")) {
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
	    					if(word.charAt(word.length()-1)!= ' ') {
	    					 word = word + " ";
	    				 }
	    				 
	    				 int qey = word.indexOf(" QEY ");
	    				 tempword = word;
	    				 int countQ = 0;
	    				 while (qey != -1) {
	    				     countQ++;
	    				     tempword = tempword.substring(qey+4);
	    				     qey = tempword.indexOf(" QEY ");
	    				     
	    				 }
	    				 int carrot = word.indexOf(" ^^ ");
	    				 int countC = 0;
	    				 tempword = word;
	    				 while (carrot != -1) {
	    				     countC++;
	    				     tempword = tempword.substring(carrot+3);
	    				     carrot = tempword.indexOf(" ^^ ");
	    				    
	    				 }
	    				 int dollar = word.indexOf(" $ ");
	    				 int countD = 0;
	    				 tempword = word;
	    				 while (dollar != -1) {
	    				     countD++;
	    				     tempword = tempword.substring(dollar+ 2 );
	    				     dollar = tempword.indexOf(" $ ");
	    				     
	    				 }
	    				 
	    				 System.out.println(name + "\n^^: "+countC+"\nqey: "+countQ+"\n$: "+countD);
	    				 }
	    			}
	    	public static void ReverseStringArray(){
	    		String list [] = {"every", "nearing", "checking", "food", "stand", "value"};
	    		
	    		String word = "";
	    		/*for (int i=0; i < list.length; i++)
	    		{
	    			word = new StringBuilder(list[i]).reverse().toString();
	    			System.out.println(word);
	    		
	    	}*/
	    		for(int i =0; i<list.length;i++) {
	    			word = "";
	    			for(int u = list[i].length()-1; u>=0; u-- ) {
		    			word += list[i].charAt(u); 
	    			}
	    			System.out.println(word);
	    			
	    	}
	    		
	    	
	    }
	    	public static void RemoveSpace() {
	    		String [] list = {"O ne", "T w o", " Th ree ",};
	    		for( int i =0;i<list.length;i++) {
	    			String word = "";
	    			for(int u = 0; u<list[i].length();u++) {
	    				if(list[i].charAt(u)!=' ') {
	    				word += list[i].charAt(u);
	    				}
	    					
	    			}
	    				list[i] = word;
	    				

	    			
	    			

	    		}
	    		System.out.print(list[0]+list[1]+list[2]);

	    	}
	    	public static void insertValue(int[] array, int data, int place) {
	    		for( int i= array.length-1; i>place;i--) {
	    			array[i] =array[i-1];
	    		}
	    		 array[place]  =data;
	    	}
	    	public static void assignment6() {
	    		 boolean incorrectOrder1 = false;
	    		 boolean incorrectOrder2 = false;
	    		Scanner sc = new Scanner(System.in);
	    		String temp = "";
	    		String [] one = new String[10000]; 
	    		String[] two = new String[10000];
	    		String text = null;
	    		String last = temp;
	    		System.out.println("Enter the values for the first array, up to 10000 values, enter 'End' to quit");
	    		
	    		for(int i = 0; i<one.length;i++) {
	    			temp = sc.nextLine().toLowerCase();
	    			if(temp.equals("end")) {
	    				break;
	    			}
	    			one[i] = temp.substring(0,1).toUpperCase()+  temp.substring(1);
	    			if(temp.compareTo(last)<0) {
	    				incorrectOrder1 = true;
	    				
	    			}
	    			last = temp;
	    		}
	    		
	    		
	    		System.out.println("\nEnter the values for the second array, up to 10000 values, enter 'End' to quit");
	    		last ="";
	    		for(int i =0;i <two.length;i++) {
	    			temp = sc.nextLine().toLowerCase();
	    			if(temp.equals("end")) {
	    				break;
	    			}
	    			two[i] = temp.substring(0,1).toUpperCase()+  temp.substring(1);
	    			if(temp.compareTo(last)<0) {
	    				incorrectOrder1 = true;
	    				
	    			}
	    			last = temp;
	    		}
	    		
	    		one  =deletedArray(one);
	    		
	    		two  =deletedArray(two);
	    		String[] mergedNull = new String[deletedArray(one).length+deletedArray(two).length]; 
	    		int x = 0;
	    		int y = 0;
	    		int z = 0;
	    		int flag =0;
	    	
	    		
	    		
	    		if(!incorrectOrder1||!incorrectOrder2) {
	    		while(z<=(one.length+two.length)-1&&flag==0) 
	    		{
	    			
	    			if(x!=one.length&&one[x].compareTo(two[y])<=0) 
	    			{
	    				
	    				mergedNull[z] = one[x];
	    				/*System.out.println(x);
	    				System.out.println(y);
	    				System.out.println(z);
	    				System.out.println(flag);
	    				System.out.println(Arrays.toString(mergedNull));
	    				System.out.println(" ");*/
	    				
	    				if(x==one.length-1)
	    					flag =1;
	    				
	    				if(x<one.length-1) 
	    					x++;
	    				if(z<=(one.length+two.length)-1)
	    					z++;
	    			}	
	    				
	    				
	    			
	    			if(y!=two.length&&one[x].compareTo(two[y])>0) 
	    			{
	    				
	    				mergedNull[z] = two[y];
	    				/*System.out.println(x);
	    				System.out.println(y);
	    				System.out.println(z);
	    				System.out.println(flag);
	    				System.out.println(Arrays.toString(mergedNull));
	    				System.out.println(" ");*/
	    				
	    				if(y==two.length-1)
	    					flag =2;

	    				if(y<two.length-1) 
	    				    y++;
	    				if(z<=(one.length+two.length)-1)
	    					z++;
	    			}
	    			
	    			
	    			}
	    	
//	    		    System.out.println("Flag : "+flag);
	    			if(flag==1) 
	    			{
	    				while(y<=two.length-1) 
	    				{
	    					mergedNull[z] = two[y];
	    					z++;
	    					y++;
	    				}
	    			}
	    			if(flag==2) 
	    			{
	    				while(x<=one.length-1) 
	    				{
	    					mergedNull[z] = one[x];
	    					z++;
	    					x++;
	    				}
	    			}
	    				
	    		}	
	    			
	    			
	    			
	    		
	    		
	    		
	    		System.out.println("\n\nFirst Array");
	    		for(int i =0;i <one.length;i++) { 
	    			if(i <one.length-1)
	    			System.out.print(orderArray(deletedArray(one))[i]+" ");
	    			else
	    				System.out.print(orderArray(deletedArray(one))[i]);

	    		}
	    		System.out.println("\n\nSecond Array");
	    		for(int i =0;i <two.length;i++) {
	    			if(i<two.length-1)
	    			System.out.print(orderArray(deletedArray(two))[i]+" ");
	    			else
	    				System.out.print(orderArray(deletedArray(two))[i]);

	    		}
	    		if(incorrectOrder1||incorrectOrder2)
	    		System.out.print("\n\nError: Arrays not in correct order");
	    		else {
	    			System.out.println("\n\nMerged Array");
	    			for(int i =0;i <deletedArray(mergedNull).length;i++) {
	    				if(i<mergedNull.length-1)
	    					System.out.print(deletedArray(mergedNull)[i]+" ");
	    					else
	    						System.out.print(deletedArray(mergedNull)[i]);

	    				
	    				
	    				
	    			}
	    		}
	    			
	    	}
	    	public static String [] deletedArray(String [] array ) {
	    		int numOfNum = 0;
	    		for(int i = 0; i < array.length; i++) {
	    			if(array[i] == null) {
	    				numOfNum++;
	    			}
	    		}
	    		
	    		
	    		String[] newArray = new String [(array.length-numOfNum)];
	    		int newArrayIndex = 0;
	    		for(int i = 0; i < array.length; i++) {
	    			if(array[i] != null) {
	    				newArray[newArrayIndex]=array[i];
	    				newArrayIndex++;
	    			}
	    		}
	    		
	    		return newArray;
	    	}
	    	public static String [] orderArray(String [] array ) {
	    		
	    		String[] arrayR = new String [array.length];
	    		String[] arrayC = new String [array.length];
	    		arrayR[0]=array[0];
	    		arrayC = arrayR.clone();
	    		for(int i = 1; i < array.length; i++)
	    		{
	    			String compare = array[i];
	    			if(i<=array.length-1) 
	    			{
	    				
	    				int u =0;
	    				while(u<arrayR.length) {
	    	
	    					
	    					
	    					if(arrayR[u]==null) 
	    					{
	    						arrayR[u]  = compare;
	    						arrayC = arrayR.clone();
	    						
	    					break;
	    					}
	    					
	    					if(compare.compareTo(arrayR[u])<=0) 
	    					{
	    						
	    						arrayR[u] = compare;
	    						
	    						for(int q =u;q<arrayR.length;q++)
	    						{
	    							
	    							
	    							if(arrayC[q]==null) {
	    								

	    								break;
	    							}
	    							if(u<arrayR.length-1) 
	    							{
	    								arrayR[u+1] = arrayC[q];
	    								
	    								u++;
	    							}
	    												
	    						
	    						}
	    						arrayC = arrayR.clone();
	    						 break;
	    					}
	    					
	    					else
	    					{
	    						u++;
	    						
	    					
	    					}
	    					
	    					
	    				}
	    				
	    				
	    				
	    			}
	    			
	    		}
	    		
	    		
	    		return arrayR;
	    	}
	    	public static void reverse(int[] array) {
	    		int length = array.length;
	    		int[] temp = new int [length];
	    		int count = 0;
	    		
	    			for(int v = array.length-1; v >=0; v-- ) {
	    			 temp[v] = array[v];
	    			 
	    			 
	    			}
	    			for(int v = array.length-1; v >=0; v-- ) {
	    				 array[v] = temp[count];
	    				 
	    				 count++;
	    				}
	    			System.out.print(array[0]+" "+array[1]+" "+array[2]+" ");
	    			
	    		}
	    	
	    	public static double average(int [] array) {
	    		double avg = 0.0;
	    		int sum =0;
	    		for(int i =0;i<array.length;i++) {
	    			
	    			sum+=array[i];
	    			avg = (double)sum/array.length;
	    		}
	    	
	    		return avg;
	    	}
	    	public static int findMax(int [] array) {
	    		int largest =0;
	    		for(int i =0;i<array.length;i++) {
	    			if(array[i]>largest) {
	    				largest = array[i];
	    			}
	    			
	    			
	    		}
	    	
	    		return largest;
	    	}
	    	public static int findMin(int [] array) {
	    		int smallest =99999;
	    		for(int i =0;i<array.length;i++) {
	    			if(array[i]<smallest) {
	    				smallest = array[i];
	    			}
	    			
	    			
	    		}
	    		
	    		return smallest;
	    	}
	    	public static int sumEven(int [] array) {
	    		int sum =0;
	    		for(int i =0;i<array.length;i++) {
	    			if(array[i]%2==0) {
	    				sum += array[i];
	    			}
	    			
	    			
	    		}
	    		
	    		return sum;
	    	}
	    	public static boolean allPositive(int [] array) {
	    		boolean pos = true;
	    		for(int i =0;i<array.length;i++) {
	    			if(array[i]<=0) {
	    				pos = false;
	    				break;
	    			}
	    			
	    			
	    		}
	    		
	    		return pos;
	    	}
	    	
	    	public static void arrayListUntilSTOP() {
	    		ArrayList<String> array = new ArrayList<String>();
	    		System.out.println("Please enter words, enter STOP to stop the loop.");
	    		while(1>0) {
	    			String data = scan.nextLine();
	    			if(data.equals("STOP"))
	    				break;
	    			array.add(data);
	    			
	    		}
	    		
	    		System.out.println(array.size());
	    		System.out.println(array);
	    		if(!array.isEmpty()&&array.size()!=1) {
	    			array.remove(0);
	    			array.remove(array.size()-1);
	    		}
	    		System.out.println(array);
	    		
	    	}
	    	public static void sortAndPrint(){
	        	String [] list = { "against" , "forms" , "belief" , "government" , "democratic" , "movement" , "understanding"};
	            String temp = "";
	            int min = 100;
	            int pos = 0;
	            for(int i=0; i<list.length;i++){
	                for(int u = i; u<list.length; u++){
	                    /*if((int)list[0].charAt(0)<min){
	                        min = (int)list[0].charAt(0);
	                        pos = u;   
	                        System.out.println("For1");

	                    }*/
	                    if(list[i].compareTo(list[u])>0){
	                    	
	                        min = (int)list[u].charAt(0);
	                        System.out.println("min = " +min);
	                        pos = u;
	                        System.out.println("pos = "+pos);
	                        temp = list[u];
	                        System.out.println("temp = "+temp);
	                        list[u] =list[i]; 
	                        list[i] = temp;

	                    }
	                }
	            } for(int c = 0; c<list.length; c++)
	            System.out.print(list[c]+" ");
	        }
	        

}
	    	


    
