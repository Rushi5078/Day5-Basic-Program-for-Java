package Calender;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		//decleration part
		int y;
		Scanner sc = new Scanner(System.in);
		//user input
		System.out.println("Enter the year");
		y = sc.nextInt();
		//check the condition
		if( y%100 == 0 && y%400 == 0 )
		{
			System.out.println("This is leap year");
		}
		else
		{
			System.out.println("This is not leap year");
		}
		
	}

}
