package codingbat_java.string2;

/**
 * 
 * We'll say that a String is xy-balanced if for all the 'x' chars in the
 * string, there exists a 'y' char somewhere later in the string. So "xxy" is
 * balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if
 * the given string is xy-balanced.
 * 
 * 
 * xyBalance("aaxbby") → true xyBalance("aaxbb") → false xyBalance("yaaxbb") →
 * false
 * 
 * @author utpal
 *
 */
public class XyBalance {

	public boolean xyBalance(String str) {
		if (str.contains("x"))
			return str.lastIndexOf("y") > str.lastIndexOf("x");

		return true;
	}

}
