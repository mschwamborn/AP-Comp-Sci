package test;

public class NumberSearchRunner {
	public static void main( String args[] )  
	{
			int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1};
			int search = 5;
			NumberSearch.getNextLargest(array, search);
			System.out.println("The next largest value after " + search + " is " + NumberSearch.getNextLargest(array, search) + "\n");

	}
}
