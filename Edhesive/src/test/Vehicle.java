package test;

public class Vehicle {
	int location;
	
	
	
	public  Vehicle() {
		location = 0;
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
		int numOfspace = 0;
		
		if(location!=Math.abs(location))
			numOfspace = Math.abs(20+location);
		else if(location == 0)
			numOfspace = 20;
		else
			numOfspace  = 20+location;
			
		for(int i =0; i<numOfspace; i++) {
			loc = loc + " ";
		}
		loc = loc + "@";
		
		return loc; 
	}
	
	
	

}
