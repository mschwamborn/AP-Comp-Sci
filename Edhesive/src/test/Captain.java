package test;

public class Captain extends UltimatePlayer {
	public boolean type;


	public Captain(String firstName, String lastName, String pos, boolean t) {
		super(firstName,lastName,pos);
		type =t;
		
	}
	public String toString() {
		String positonC;
		if(type)
			positonC = "offense";
		else
			positonC = "defense";
		return super.toString()+" \n"+"   Captain: "+positonC;
	}

}
