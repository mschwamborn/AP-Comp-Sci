package test;

public class UltimatePlayer extends Person {
	public static int jerseyNumber = 0;
	String position;
	
	public UltimatePlayer(String firstName, String lastName, String pos) {
		super(firstName,lastName);
		jerseyNumber++;
		
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
		return lastName+", "+firstName+"\n\tJersey #: "+jerseyNumber+"\n\tPosotion: "+position;
	}

}

/*public class UltimatePlayer  {
	public static int jerseyNumber = 0;
	String position;
	String lname;
	String fname;
	
	public UltimatePlayer(String firstName, String lastName, String pos) {
		//super(firstName,lastName);
		jerseyNumber++;
		lname = lastName;
		fname = firstName;
		
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
		return lname+", "+fname+"\n\tJersey #: "+jerseyNumber+"\n\tPosotion: "+position;
	}

}*/