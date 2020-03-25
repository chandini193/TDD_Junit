package chandini.com.ttd_junit;

public class Remove_a_InFirstTwoChars {

	public String removeA(String string) {
		int len = string.length();
		if(len >= 2 && string.charAt(0) == 'A' && string.charAt(1) == 'A')
			return string.substring(2);
		else if(len >= 1 && string.charAt(0) == 'A')
			return string.substring(1);
		else if(len >= 2 && string.charAt(1) == 'A')
			return string.charAt(0)+string.substring(2);
		return string;
	}

}
