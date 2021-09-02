
import java.util.*;
class FindLargest {
	public static void main(String[] args) {


		// Get user input value of a,b,c

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter Second number");
		int b=sc.nextInt();
		System.out.println("Enter Third number");
	        int c=sc.nextInt();

		if (a > b && a > c) {  // check a is greater

			System.out.println(a+ " is a Largest Number");
		}
		else if (b > c) {      // check b is greater

 			System.out.println(b+ " is a Largest Number");
		}
		else			       // otherwise print c is greater	
	
			System.out.println(c+ " is a Largest Number");
	}
}
