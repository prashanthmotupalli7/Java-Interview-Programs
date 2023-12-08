package test;

import java.util.Random;

public class OtpGenerator {

	
	 public static String otpGen() {
		 StringBuilder otp=new StringBuilder();
		 Random random=new Random();
		 for(int i=0;i<6;i++) {
			 otp.append(random.nextInt(0,10));
		 }
		return otp.toString();
	 }
	public static void main(String[] args) {

		System.out.println(otpGen());
	}

}
