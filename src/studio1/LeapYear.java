package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a year:");
		int year = in.nextInt();
		boolean four = year % 4 == 0;
		boolean oneHundred = (year % 100) != 0;
		boolean fourHundred = (year % 400) == 0;
		boolean leapYear = (four && oneHundred) || fourHundred;
		System.out.println(year + " is a leap year: " + leapYear);
		
	}

}
