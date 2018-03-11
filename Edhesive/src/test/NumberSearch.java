package test;

public class NumberSearch
{
	public static int getNextLargest(int[] array, int num)
	{
		int next = Integer.MAX_VALUE;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > num && (array[i]-num < next-num)) {
				next = array[i];
			}
		}
		return next;
	}
}