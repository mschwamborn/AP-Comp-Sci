package test;
import java.util.Arrays;


public class NumberShifterRunner
{
	public static void main( String args[] )  
	{
		int[] array = NumberShifter.makeLucky7Array(10);
		NumberShifter.shiftEm(array);
		System.out.println(Arrays.toString(array));	}
}



