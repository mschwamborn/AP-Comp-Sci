package test;

public class Vehicle {
	int location;
	
	
	
	public  Vehicle() {
		location = 0;
		toString();
	}

	public   Vehicle(int loc) {
		if(loc>= -20&&loc<= 20)
			location = loc;
		
		else
			location = 0;
		
	}
	
	public void forward() {
		if(location < 20) {
			location++;
		}
		else
			location =20;
	}
	public void backward() {
		if(location > -20) {
			location--;
		}
		else
			location =-20;
	}
	
	public int getLocation() {
		return location;
	}
	
	public String toString() {
		String loc = "";
		
		for(int i =0; i<location; i++) {
			loc = loc + " ";
		}
		loc = loc + "@";
		
		return loc; 
	}
	
	
	

}
