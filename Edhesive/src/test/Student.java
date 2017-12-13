package test;

public class Student {
	private String fname = "";
	private String lname = "";
	private int gradelvl =0;
	private double Gpa =0;
	private static int sid =0;
	
	public Student(){
		this("None","None",0,0.0);
	}
	
	
	public Student(String firstName, String lastName, int gradeLevel, double gpa){
		fname = firstName;
		lname = lastName;
		
		if(gradeLevel>=0&&gradeLevel<=12)
			gradelvl = gradeLevel;
		else
			gradelvl=0;
		if(gpa>=0&&gpa<=4.5)
			Gpa = gpa;
		else
			gpa=0.0;
		sid++;
	}
	
	public String toString() {
		
		
		
		return lname+", "+fname+"\nGPA: "+Gpa+"\nGrade Level: "+gradelvl+" id # "+sid;
			
	}
}

