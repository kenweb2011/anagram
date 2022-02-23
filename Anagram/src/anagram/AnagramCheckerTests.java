package anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramCheckerTests
{
	@BeforeEach
	void setUp() throws Exception
	{
	}

	@Test
	void testAnagramCheckerList()
	{
		AnagramCheckerList sut = new AnagramCheckerList();
		assertTrue(sut.IsAnagram("anagram", "nagaram"));
		assertFalse(sut.IsAnagram("anagram", "anagaram"));
		assertTrue(sut.IsAnagram("aNagrAm", "NAgaram"));
		assertTrue(sut.IsAnagram("binary", "brainy"));
		assertTrue(sut.IsAnagram("adobe", "abode"));
	}

	@Test
	void testAnagramCheckerSort()
	{
		AnagramCheckerSort sut = new AnagramCheckerSort();
		assertTrue(sut.IsAnagram("anagram", "nagaram"));
		assertFalse(sut.IsAnagram("anagram", "anagaram"));
		assertTrue(sut.IsAnagram("aNagrAm", "NAgaram"));
		assertTrue(sut.IsAnagram("binary", "brainy"));
		assertTrue(sut.IsAnagram("adobe", "abode"));
	}
	
}
