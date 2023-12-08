package test;

public class e2OpenInterview {
//pras!han@th 
	public static void main(String[] args) {
		String str="pras!han@th";
		String res="";
         char[] c=str.toCharArray();
         for(int i=0;i<c.length;i++) {
        	 if(c[i]>=65 && c[i]<=130) {
        		res+=c[i];
        	 }
         }
         System.out.println(res);
	}

}
