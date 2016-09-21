
public class TheBeginning {
	
	/*
	 * The first known secret code
	 * It is an alphabet shift
	 * start with plan text and a "key"
	 * lets say key = 2
	 * and plain text is abc
	 * then a + 2 --> c
	 * b + 2 --> d
	 * c + 2 --> e
	 * so secret code of abc is cde
	 * decipher the code is just reversing the key
	 * 
	 * GRADED STUFF
	 * 0. use a JOp to ask for the plaintext
	 * 1. fix space problem
	 * 2. fix the z wrap
	 * 
	 * for this part syso is fine
	 * add decoding knowing the key -- reverse process
	 * 
	 * Next part
	 * crack a code not knowing the key
	 */

	public static void main(String[] args) {
		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		int key = 2;
		String plaintext = "I love Java";
		String codedText = "";
		int indexPlaintext = 0;
		int indexShifted = 0;
		
		// one baby step at a time -- couple lines of code and test...
		
		plaintext = plaintext.toLowerCase();
		
		
		for (int i = 0; i < plaintext.length(); i++){
		indexPlaintext = alpha.indexOf(plaintext.charAt(i));
			
		
		indexShifted = indexPlaintext + key;
		
		
		codedText = codedText + alpha.charAt(indexShifted);
		
		}// end of for loop
		
		System.out.println("Original: " + plaintext);
		System.out.println("key: " + key);
		System.out.println("Secret coded msg: "+ codedText);

	}// end of main

}// end of class
