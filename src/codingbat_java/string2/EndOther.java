package codingbat_java.string2;

/**
 * 
 * Given two strings, return true if either of the strings appears at the very
 * end of the other string, ignoring upper/lower case differences (in other
 * words, the computation should not be "case sensitive"). Note:
 * str.toLowerCase() returns the lowercase version of a string.
 * 
 * endOther("Hiabc", "abc") → true endOther("AbC", "HiaBc") → true
 * endOther("abc", "abXabc") → true
 * 
 * 
 * @author utpal
 *
 */

public class EndOther {

	public boolean endOtherLogic1(String a, String b) {
		if (a.length() > b.length() && a.substring(a.length() - b.length()).equalsIgnoreCase(b)) {
			return true;
		} else if (a.length() < b.length() && b.substring(b.length() - a.length()).equalsIgnoreCase(a))
			return true;
		else if (a.equalsIgnoreCase(b))
			return true;

		return false;
	}

	public boolean endOtherLogic2(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();

		if (a.length() > b.length())
			return a.endsWith(b);

		if (b.length() > a.length())
			return b.endsWith(a);

		return a.equalsIgnoreCase(b);
	}

}
