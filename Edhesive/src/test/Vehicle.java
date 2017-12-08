package test;

public class Vehicle {
	int location;
	
	public Vehicle() {
		location = 0;
	}

	public  Vehicle(int loc) {
		if(loc> -20||loc< 20)
			location = loc;
		else
			location = 0;
		
	}
	
	
	

}
