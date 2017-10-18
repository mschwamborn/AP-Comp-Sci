package test;
import java.util.*;

public class Shortcuts implements ShortcutI{
	 public static final Shortcuts s = new Shortcuts();
	 public static Scanner scan;
	
	public void Print(String input) {
		System.out.print(input);
	}
	public void PrintLn(String input) {
		System.out.println(input);
	}
	public void Scanner( ) {
		final Scanner scanner = new Scanner (System.in);
		scan = scanner;
	}
	public String ScanInput() {
		String data = scan.nextLine();
		return data;
	}
	public void PrintScan() {
		System.out.print(s.ScanInput());
	}
	
	

}
