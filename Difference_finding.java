package string;

public class Difference_finding {
	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcdef";
		System.out.println(strDiffChop(s,t));
		
	}
	static String strDiffChop(String s1, String s2) {
		if(s1.length()>s2.length()) {
			return s1.substring(s2.length());
		}
		else if(s2.length()>s1.length()) {
			return s2.substring(s1.length());
		}
		else {
			return " ";
		}
	}

}
