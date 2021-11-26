package string;


public class Duplicate {
	public static void main(String[]args) {
		int arr[] = {1,2,5,5,6,7,7,8,8,8,9,9,3,6};
		int n = arr.length;
		System.out.println(duplicate(arr,n));
	}
	static boolean duplicate (int arr[],int n) {
		for(int i = 1;i<n;i++) {
			for(int j= 0;j<i;j++) {
				return true;
			}
		}
	}
	return false;

}
