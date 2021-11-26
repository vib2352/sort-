package string;

public class Sortsent {
	public static void main(String [] args) {
		String str = "is2 this1 a3 demo4";
		System.out.println(sort_sentence(str));
	}
	public static String sort_sentence(String str) {
		String[] arr = str.split(" ");
		String [] output = new String [arr.length];
		for(int i= 0;i<arr.length;i++) {
			char ch = arr[i].charAt(arr[i].length()-1);
			int x = Character.getNumericValue(ch);
			output[x-1]=arr[i].substring(0,arr[i].length()-1);
		}
		String results = " ";
		for(String e : output) {
			results = results + " "+e;
		}
		return results.trim();
	}

}
