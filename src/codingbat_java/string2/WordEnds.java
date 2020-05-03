package codingbat_java.string2;

/**
 * iven a string and a non-empty word string, return a string made of each char
 * just before and just after every appearance of the word in the string. Ignore
 * cases where there is no char before or after the word, and a char may be
 * included twice if it is between two words.
 * 
 * 
 * wordEnds("abcXY123XYijk", "XY") → "c13i" wordEnds("XY123XY", "XY") → "13"
 * wordEnds("XY1XY", "XY") → "11"
 * 
 * @author utpal
 *
 */

public class WordEnds {

	public String wordEnds(String str, String word) {

		if (!str.contains(word) || str.equals(word))
			return "";

		String result = "";

		for (int i = 0; i < str.length(); i++) {
			int index = str.indexOf(word, i);
			if (index > -1) {
				int b = index + word.length();
				if (index == 0)
					result += str.substring(b, b + 1);
				else if (index == str.length() - word.length())
					result += str.substring(index - 1, index);
				else
					result += str.substring(index - 1, index) + str.substring(b, b + 1);
				i = index + word.length() - 1;
			} else
				break;
		}

		return result;

	}

}
