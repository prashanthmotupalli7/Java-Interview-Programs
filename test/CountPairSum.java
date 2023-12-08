package test;

public class CountPairSum {
	
	public static int countPair(int[] arr,int sum) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					count++;
				}
			}
		}
		return count;
	}
	public static void findPairsWithSum(int[] arr, int sum) {
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i] + arr[j] == sum) {
	                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
	            }
	        }
	    }
	}

	
	
	public static void main(String[] args) {
	  int[] arr= {1,3,5,6,7,2,9,4,-9,-1};
	  System.out.println("Count of  pairs that are equal to given sum "+countPair(arr, 6));
		findPairsWithSum(arr, 9);
	  }
	}

