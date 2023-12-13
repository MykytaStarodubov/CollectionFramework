package ua.foxminded.collectionframework;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CollectionFramework {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String scannerForInput = scanner.nextLine();
		System.out.println((countUniqueChars((scannerForInput))));
	}

	public static int countUniqueChars(String str) {

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
		return charCounts.size();
	}
}
