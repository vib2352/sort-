package string;
import java.util.Arrays;

public class Anagram {
	public static void main(String []args) {
		String s = "abcd";
		String t = "dcba";
		if(s.length()!=t.length()) {
			System.out.println("not valid anagram");
		}
		char [] ch1= s.toCharArray();
		char [] ch2 = t.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)) {
			System.out.print("valid anagram");
			
		}
		else {
			System.out.print("not valid anagram");
		}
		
	}
	

}
