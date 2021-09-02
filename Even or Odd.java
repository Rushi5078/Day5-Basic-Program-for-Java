package CheckNumber;

import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[] args) {
		//decleration part
		int num;
		Scanner sc = new Scanner(System.in);
		//user input
		System.out.println("Enter the number ");
	 num = sc.nextInt();
	 //execution part
	 
	 if(num % 2==0)
	 {
		 System.out.println("the number is even");
	 }
	 else
	 {
		 System.out.println("the number is odd");
	 }
	 
	 }
	 
	}
