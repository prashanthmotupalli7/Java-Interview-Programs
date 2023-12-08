package test;

public class ReverseArray {
	
	   public static String[] reverseStrings(String[] arr) {
	        String[] result = new String[arr.length];
	        for (int i = 0; i < arr.length; i++) {
	            result[i] = new StringBuilder(arr[i]).reverse().toString();
	        }
	        return result;
	    }
	   
	   public static int[] reverseNumbers(int[] arr) {
	        int[] result = new int[arr.length];
	        for (int i = 0; i < arr.length; i++) {
	            result[i] =Integer.parseInt(new StringBuilder(String.valueOf(arr[i])).reverse().toString());
	        }
	        return result;
	    }
	
	
   public static void main(String[] args) {
	   int[] numArr= {1,23,456,7890,1112,13145};
	   int[] result=reverseNumbers(numArr);
	   String[] words= {"bunny","bunty","shyam","bertolettie"};
       String[] reversedStrings = reverseStrings(words);
       for(String str :reversedStrings)
    	   System.out.print(str+" ");
       for(int n :result)
    	   System.out.print(n+" ");
       

	
}
}