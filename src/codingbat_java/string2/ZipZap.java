package codingbat_java.string2;

/**
 * Look for patterns like "zip" and "zap" in the string -- length-3, starting
 * with 'z' and ending with 'p'. Return a string where for all such words, the
 * middle letter is gone, so "zipXzap" yields "zpXzp".
 * 
 * 
 * zipZap("zipXzap") → "zpXzp" zipZap("zopzop") → "zpzp" zipZap("zzzopzop") →
 * "zzzpzp"
 * 
 * @author utpal
 *
 */

public class ZipZap {

	public String zipZap(String str) {
		if (str.length() < 3)
			return str;

		String newStr = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
				newStr += str.substring(i, i + 1) + str.substring(i + 2, i + 3);
				i = i + 2;
			} else
				newStr += str.substring(i, i + 1);
		}

		return newStr;
	}

}
