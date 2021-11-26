package string;

public class Major {
	public static void main(String[]args) {
		int arr[] = {1,3,4,4,5,6,7,4,4,4,4};
		int n= arr.length;
		majority(arr,n);
	}
	static void majority (int arr[],int n) {
		int maxcount =0;
		int index = -1;
		for(int i=0;i<n;i++) {
			int count = 0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>maxcount) {
				maxcount=count;
				index=i;
			}
		}if(maxcount>n/2) {
			System.out.println(arr[index]);
		}
		else {
			System.out.println("no majority");
		}
	}

}
