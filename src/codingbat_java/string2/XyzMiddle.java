package codingbat_java.string2;

/**
 * Given a string, does "xyz" appear in the middle of the string? To define
 * middle, we'll say that the number of chars to the left and right of the "xyz"
 * must differ by at most one. This problem is harder than it looks.
 * 
 * 
 * xyzMiddle("AAxyzBB") → true xyzMiddle("AxyzBB") → true xyzMiddle("AxyzBBB") →
 * false
 * 
 * @author utpal
 *
 */
public class XyzMiddle {

	public boolean xyzMiddle(String str) {
		if (!str.contains("xyz"))
			return false;

		boolean bool = false;
		String LString, RString = str;

		for (int i = 0; i < str.length(); i++) {
			int index = str.indexOf("xyz", i);
			if (!(index < 0)) {
				LString = str.substring(0, index);
				RString = str.substring(index + 3);

				bool = Math.abs(LString.length() - RString.length()) <= 1;
				if (bool == true)
					break;
				i = index + 3;
			}

		}

		return bool;
	}
}
