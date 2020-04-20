package codingbat_java.string2;

/**
 * Given two strings, a and b, create a bigger string made of the first char of
 * a, the first char of b, the second char of a, the second char of b, and so
 * on. Any leftover chars go at the end of the result.
 * 
 * 
 * mixString("abc", "xyz") → "axbycz" mixString("Hi", "There") → "HTihere"
 * mixString("xxxx", "There") → "xTxhxexre"
 * 
 * @author utpal
 *
 */

public class MixString {

	public String mixString(String a, String b) {
		if (a.isEmpty())
			return b;
		else if (b.isEmpty())
			return a;

		int aLen = a.length(), bLen = b.length();
		int flag = 0;

		String result = "";
		String smaller = aLen < bLen ? a : b;

		for (int i = 0; i < smaller.length(); i++) {
			for (int j = i; j < i + 1; j++) {
				result += a.substring(i, i + 1) + b.substring(j, j + 1);
			}
			flag = i + 1;
		}
		String remStr = aLen > bLen ? a.substring(flag) : b.substring(flag);

		return result + remStr;
	}

}
