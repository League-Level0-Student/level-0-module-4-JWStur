package _03_char._2_string_methods;

import javax.swing.JOptionPane;

public class StringMethods {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to contain a minimum of 3 characters
		String word = JOptionPane.showInputDialog("Write a string");
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
	//	System.out.print(word.charAt(3));
		
		// 3. Print the length of your String to the console.
		//    HINT: .length()
	//	System.out.print(word.length());

		
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
		for (int i = 1; i <= word.length();i++) {
			System.out.print(word.charAt(i-1));
		}
		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
		String s = JOptionPane.showInputDialog("What character would you like to be found?");
		char c = s.charAt(0);
		
				for (int j = 0; j < word.length(); j++){
					if (word.charAt(j) == c) {
						JOptionPane.showMessageDialog(null, "The character " + c + " is at the " + (j + 1) + " place in your string");
					}
				}
		
	}
}


