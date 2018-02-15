package test;

public class Captain extends UltimatePlayer {
	public boolean type;
	public Captain(String firstName, String lastName, String pos, boolean t) {
		super(firstName,lastName,pos);
		type =t;
		
	}
	public String toString() {
		return (super.toString()+"\n"+"   Captain: "+(type ? "offense" : "defense"));
	}
}
