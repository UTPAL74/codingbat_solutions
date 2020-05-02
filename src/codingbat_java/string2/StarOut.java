package codingbat_java.string2;

/**
 * Return a version of the given string, where for every star (*) in the string
 * the star and the chars immediately to its left and right are gone. So "ab*cd"
 * yields "ad" and "ab**cd" also yields "ad".
 * 
 * 
 * starOut("ab*cd") → "ad" starOut("ab**cd") → "ad" starOut("sm*eilly") →
 * "silly"
 * 
 * @author utpal
 *
 */

public class StarOut {

	public String starOut(String str) {

		if (str.contains("*")) {
			if (str.length() <= 2)
				return "";
			else {
				if (str.startsWith("*") && str.endsWith("*"))
					str = str.substring(2, str.length() - 2);
				else if (str.startsWith("*"))
					str = str.substring(2);
				else if (str.endsWith("*"))
					str = str.substring(0, str.length() - 2);
				for (int j = 0; j < str.length() - 1; j++) {
					int startIndex = str.indexOf("*");
					if (!str.contains("*"))
						return str;
					int endIndex = startIndex;
					for (int i = startIndex + 1; i < str.length(); i++) {
						if (endIndex >= 0 && str.indexOf("*", i) - endIndex == 1) {
							endIndex = str.indexOf("*", i);
							continue;
						} else
							break;

					}

					str = str.replace(str.substring(startIndex - 1, endIndex + 2), "");
				}
			}
		}

		return str;
	}

}
