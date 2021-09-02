package Factors;

import java.util.Scanner;

public class Dvision {
	public static void main(String[] args) {
		//decleration part
		int a;
		int b;
		int result1;
		int result2;
		Scanner sc = new Scanner(System.in);
		//get input for user
		System.out.println("Enter the first number of a");
		a = sc.nextInt();
		System.out.println("Enter the second number of b");
		b = sc.nextInt();
		
		//execution part
		result1 = (a/b);
	System.out.println(result1);
		result2 = (a%b);
				System.out.println(result2);
		
	}

}
