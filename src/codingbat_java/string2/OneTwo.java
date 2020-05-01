package codingbat_java.string2;

/**
 * Given a string, compute a new string by moving the first char to come after
 * the next two chars, so "abc" yields "bca". Repeat this process for each
 * subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of
 * fewer than 3 chars at the end.
 * 
 * 
 * oneTwo("abc") → "bca" oneTwo("tca") → "cat" oneTwo("tcagdo") → "catdog"
 * 
 * @author utpal
 *
 */
public class OneTwo {
	public String oneTwo(String str) {
		StringBuilder sb = new StringBuilder(str), result = new StringBuilder();

		if (sb.length() < 3)
			return "";

		for (int i = 0; i < sb.length(); i += 3) {
			int endIndex = i + 3 > sb.length() ? sb.length() : i + 3;
			StringBuilder localStr = new StringBuilder(sb.substring(i, endIndex));

			if (localStr.length() == 3) {
				StringBuilder firstStr = new StringBuilder(localStr.substring(1));
				StringBuilder lastStr = new StringBuilder(localStr.substring(0, 1));
				result = result.append(firstStr.append(lastStr));
			}
		}

		return new String(result);
	}

}
