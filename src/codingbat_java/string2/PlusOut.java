package codingbat_java.string2;

/**
 * Given a string and a non-empty word string, return a version of the original
 * String where all chars have been replaced by pluses ("+"), except for
 * appearances of the word string which are preserved unchanged.
 * 
 * 
 * plusOut("12xy34", "xy") → "++xy++" plusOut("12xy34", "1") → "1+++++"
 * plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
 * 
 * @author utpal
 *
 */

public class PlusOut {

	public String plusOut(String str, String word) {

		for (int i = 0; i < str.length();) {
			int index = str.indexOf(word, i);
			if (index >= 0) {
				String newStr = str.substring(i, index);
				String temp = "";
				for (int j = 0; j < newStr.length(); j++) {
					temp += "+";
				}
				StringBuffer sb = new StringBuffer(str);
				sb.replace(i, i + newStr.length(), temp);
				str = new String(sb);
				i = index + word.length();
			} else {
				String lastStr = str.substring(i);
				String lastTemp = "";
				for (int m = 0; m < lastStr.length(); m++) {
					lastTemp += "+";
				}

				str = str.substring(0, i) + lastTemp;
				break;
			}

		}

		return str;
	}

	public String plusOutBySplit(String str, String word) {

		StringBuffer sb = new StringBuffer();

		String[] arr = str.split(word);
		int arrLen = arr.length;

		for (int i = 0; i < arrLen; i++) {
			String replaceBy = "";
			for (int j = 0; j < arr[i].length(); j++) {
				replaceBy += "+";
			}
			sb = sb.append(replaceBy);

			if (i < arrLen - 1 || str.endsWith(word))
				sb = sb.append(word);
		}

		return new String(sb);
	}

}
