package codingbat_java.string2;

public class XyzThere {

	public boolean xyzThere(String str) {
		if (str.length() < 3)
			return false;

		if (str.substring(0, 3).equals("xyz"))
			return true;

		for (int i = 1; i < str.length(); i++) {
			int index = str.indexOf("xyz", i);
			if (index > -1 && !(str.charAt(index - 1) == '.')) {
				return true;
			}
		}

		return false;
	}

}
