package ua.foxminded.collectionframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CollectionFrameworkTest {

	@Test
	public void countUniqueChars_nullInput_throwsNullPointerException() {
		assertThrows(NullPointerException.class, () -> CollectionFramework.countUniqueChars(null));
	}

	@Test
	public void countUniqueChars_oneWordWithOnlyLetters_returnsCount() {
		String input = "Hello";
		String expectedCount = "4";
		String actualCount = CollectionFramework.countUniqueChars(input);
		assertEquals(expectedCount, actualCount);
	}

	@Test
	public void countUniqueChars_emptyString_returnsZero() {
		String input = "";
		String expectedCount = "0";
		String actualCount = CollectionFramework.countUniqueChars(input);
		assertEquals(expectedCount, actualCount);
	}

	@Test
	public void countUniqueChars_stringWithSingleSpace_returnsCountIgnoringSpace() {
		String input = "One word";
		String expectedCount = "8";
		String actualCount = CollectionFramework.countUniqueChars(input);
		assertEquals(expectedCount, actualCount);
	}

	@Test
	public void countUniqueChars_stringWithSeveralSpaces_returnsCountIgnoringSpaces() {
		String input = "This   has several   spaces";
		String expectedCount = "12";
		String actualCount = CollectionFramework.countUniqueChars(input);
		assertEquals(expectedCount, actualCount);
	}

}
