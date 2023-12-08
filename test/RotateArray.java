package test;

public class RotateArray {
	 static void reverse(int arr[], int low,int high) {
		 while(low<high) {
			 int temp=arr[low];
			 arr[low]=arr[high];
			 arr[high]=temp;
			 low++;
			 high--;
		 
		 
		 }
	 }
	 
	 static void rotate(int arr[],int n,int k) {
		 k=k%n;
		 reverse(arr, 0, n-k-1);
		 reverse(arr,n-k,n-1);
		   reverse(arr,0,n-1);
	 }
	
	public static void main(String[] args) {
		
		int arr[]= {34,67,89,56,90,14,15};
		rotate(arr,arr.length,3);
		for(int i:arr)
			System.out.print(i+" ");
		
	}

}
