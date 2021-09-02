package PrintTable;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {
		//decleration part
		int c;
		Scanner sc = new Scanner(System.in);
		//user input
		System.out.println("Enter the number");
		c = sc.nextInt();
		
		//execution part
		for(int i=1;i<=c;i*=2)
		{
			System.out.println( i);
		}
		
		
	}

}
