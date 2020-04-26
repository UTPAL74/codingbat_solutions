package codingbat_java.string2;

/**
 * 
 * Returns true if for every '*' (star) in the string, if there are chars both
 * immediately before and after the star, they are the same.
 * 
 * 
 * sameStarChar("xy*yzz") → true sameStarChar("xy*zzz") → false
 * sameStarChar("*xa*az") → true
 * 
 * @author utpal
 *
 */

public class SameStartChar {

	public boolean sameStarChar(String str) {
		int index = 0;

		for (int i = 1; i < str.length() - 1; i++) {
			index = str.indexOf("*", i);

			if (index >= 0 && index < str.length() - 1 && str.charAt(index - 1) != str.charAt(index + 1))
				return false;
		}

		return true;
	}

	//Another way
	public boolean sameStarChar2(String str) {

		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) == '*' && (str.charAt(i - 1) != str.charAt(i + 1)))
				return false;
		}
		return true;
	}

}
