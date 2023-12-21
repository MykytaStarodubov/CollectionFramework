package ua.foxminded.collectionframework;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CollectionFramework {

	 private static Map<String, String> cache = new HashMap<>();
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		 while (true) {
	            String scannerForInput = scanner.nextLine();

	          
	            String count = cache.get(scannerForInput);
	            if (count != null) {
	                System.out.println(count);
	            } else {
	               
	                count = countUniqueChars(scannerForInput);
	                cache.put(scannerForInput, count);
	                System.out.println(count);
	            }
		 }
		
	}

	public static String countUniqueChars(String str) {
		
		if (str == null) {
		    throw new NullPointerException("Input string cannot be null");
		  }
		
		Map<Character, Integer> charCounts = new HashMap<>();
		 StringBuilder uniqueChars = new StringBuilder();
		for (char c : str.toCharArray()) {

			if (!charCounts.containsKey(c)) {
	
				charCounts.put(c, 1);
	            uniqueChars.append(c);
	            
			} else {

				charCounts.put(c, charCounts.get(c) + 1);
			}
		}

		for (int i = 0; i < uniqueChars.length(); i++) {
			char c = uniqueChars.charAt(i);
			System.out.println("'" + c + "' - " + charCounts.get(c));
		}

		System.out.print("Total unique characters:");
		return charCounts.size() + "";
	}
}
