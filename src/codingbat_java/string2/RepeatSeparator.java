package codingbat_java.string2;

/**
 * Given two strings, word and a separator sep, return a big string made of
 * count occurrences of the word, separated by the separator string.
 * 
 * 
 * repeatSeparator("Word", "X", 3) → "WordXWordXWord" repeatSeparator("This",
 * "And", 2) → "ThisAndThis" repeatSeparator("This", "And", 1) → "This"
 * 
 * @author utpal
 *
 */

public class RepeatSeparator {

	public String repeatSeparator(String word, String sep, int count) {
		String result = "";

		while (count > 0) {
			if (count == 1)
				sep = "";
			result += word + sep;
			count--;
		}

		return result;
	}

}
