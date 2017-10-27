package test;

public class Bart {

	public static void main(String[] args) {
		
		vertical("HEY");

	}
	
	
	public static  void writePunishment(String punish, int repeat)
	{
		for(int i =1;i<repeat;i++) {
			System.out.println(punish);
		}
	}

	public static  void vertical(String word)
	{
		
		for(int i =0;i<word.length();i++) {
	 
			
			System.out.println(word.substring(i,i+1));
			
			
		}
	}
	/*public static  void padding(String word,int length)
	{
		
		for(int i =0;i<word.length();i++) {
			
			
			System.out.println(word.substring(i,i+1));
			
		}
	}*/
	
	

}
