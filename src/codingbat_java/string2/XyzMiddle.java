package codingbat_java.string2;

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
