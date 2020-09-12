package _99_extra;


public class StringMethods2 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.
		String s = "this is a string";
		// 2. Print your String to the console in upper case.
		System.out.println(s.toUpperCase());
		// 3. Print your String to the console in lower case.
		System.out.println(s.toLowerCase());
		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end)
		System.out.println(s.substring(0,2));
		// 5. Print a single char somewhere in the middle of your String
		//    REMINDER: char's in string start at index 0
		System.out.println(s.charAt(5));
		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
		System.out.println(s.substring((s.length()-3),s.length()));
	}
}
