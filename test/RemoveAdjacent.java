package test;

public class RemoveAdjacent {
	
	static String removeAdjStr(String str) {
		StringBuilder sb=new StringBuilder(str);
		int i=0;
		while(i<sb.length()-1) {
			if(sb.charAt(i)==sb.charAt(i+1)) {
				sb.delete(i, i+2);
				i=0;
			}else {
				i++;
			}
			
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String str="abbccddddef";
		System.out.println(removeAdjStr(str));
		
	}

}
