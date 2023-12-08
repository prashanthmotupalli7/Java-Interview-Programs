package test;

public class StringCompress {
	public static String compress(String str) {
		if(str==null||str.isEmpty()) {
			return str;
		}
		StringBuilder s= new StringBuilder();
		int count=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1)) {
				count++;
			}
			else {
				s.append(str.charAt(i-1)).append(count);
				count =1;
			}
			
		}
		s.append(str.charAt(str.length()-1)).append(count);
	return s.length() < str.length() ? s.toString() : str;

	}
	
	public static void main(String[] args) {
		String str="abbcccdddd";
		System.out.println(compress(str));
		
		
	}

}
