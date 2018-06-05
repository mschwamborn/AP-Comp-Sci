package test;

public class CeaserCipher {

	public static void main(String[] args) {
		System.out.println(encrypt("Hazen Rocks", 12));
		System.out.println(decrypt("NCWRMLKYLLGLE", 24));

	}
	public static String encrypt(String word, int offset) {
		word = word.toUpperCase();
		String encryptedWord = "";
		
		for(int i =0; i<word.length();i++) {
			if(word.charAt(i) == ' ') 
				encryptedWord += " ";
			else
				encryptedWord += (char) ((word.charAt(i) - 65 + offset)%26 + 65);
		}
		return encryptedWord;
	}
	public static String decrypt(String word, int offset) {
		String dencryptedWord = "";
		for(int i =0; i<word.length();i++) {
			if(word.charAt(i) == ' ') 
				dencryptedWord += " ";
			else
				dencryptedWord += (char) ((word.charAt(i) - 65 + (26-(offset%26)))%26 + 65);
		}
		return dencryptedWord;
	}

}
