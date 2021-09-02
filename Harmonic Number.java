package Gemotery;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		 //decleration part
		int num;
		double sum = 0.0;
		int i = 1;
		Scanner sc = new Scanner (System.in);
		//user input
		System.out.println("Enter the number");
		num = sc.nextInt();
		//execution part 
		
		for(i=1;i<=num;i++)
		{
			sum = sum + 1.0/i;
			System.out.println("harmonic number is :" +sum);
			
		}
		
		
	}

}
