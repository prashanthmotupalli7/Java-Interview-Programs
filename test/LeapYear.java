package test;

import java.util.Scanner;

public class LeapYear {
	
	public static boolean leapYear(int year) {
		if(year%4==0) {
			if(year%100==0) {
				return year%400==0;
			}
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year : ");
		int year=sc.nextInt();
		sc.close();
		if(leapYear(year))
			System.out.println(year +" is a Leap Year");
		else
			System.out.println(year +" is not a Leap Year");
			
		

}
}