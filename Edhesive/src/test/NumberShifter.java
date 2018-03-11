package test;



public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] array = new int[size];
		for(int i =0; i<size; i++) {
			array[i] = (int) (Math.random()*10 + 1);
		}
		return array;
	}
	public static void shiftEm(int[] array)
	{
		int temp = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 7) {
				array[i] = array[temp];
				array[temp] = 7;
				temp++;
			}
		}
	}
	
}