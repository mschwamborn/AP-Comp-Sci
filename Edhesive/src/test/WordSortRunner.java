package test;
import java.util.Arrays;
import static java.lang.System.*; 

public class WordSortRunner
{
	public static void main(String args[])
	{
		WordSort s = new WordSort("123 ABC abc 034 dog cat sally sue bob 2a2");
		System.out.println(s.toString());
	}
}