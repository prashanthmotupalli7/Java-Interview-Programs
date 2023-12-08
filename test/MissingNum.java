package test;

public class MissingNum {
	static int missNum(int arr[]) {
		int n=arr.length;
		int totalSum=(n+1)*(n+2)/2;
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=arr[i];
			
		}
		int missedNumber= totalSum-sum;
		return missedNumber;
	}
	
	public static void main(String[] args) {
		int arr[]= {3,5,6,1,2};
		System.out.println(missNum(arr));
	}

}
