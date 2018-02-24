package test;

public class UltimatePlayer extends Person {

	static int jerseyNumber = 0;
	int playerJNum;
	String position;
/*	String lname;
	String fname;*/
	public UltimatePlayer() {
		this("John","Doe","handler");
	}
	public UltimatePlayer(String firstName, String lastName, String pos) {
		super(firstName,lastName);
		
			jerseyNumber++;
			playerJNum = jerseyNumber;
		
		
		if(pos.equals("handler")||pos.equals("cutter")){
			position=pos;
			
		}
		else
			position = "handler";

	}
	
	public String getPosition(){
		return position;
	}
	
	public String toString() {
		return super.toString()+"\n   Jersey #: "+playerJNum+"\n   Position: "+position;
	}

}