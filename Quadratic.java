package FunctionProgramArray;
import java.util.Scanner;
public class Quadratic {



	// deltacalculatin Method

	static int deltaCalculation(int a, int b, int c) {
		int sum1 = (b * b) - (4 * a * c);
		return sum1;
	}

	// rootcalculation1 Method

	static double rootCalculation1(int delta, int a, int b) {
		double root11 = (-b + Math.sqrt(delta)) / (2 * a);
		return root11;
}

	// rootcalculation2 Method

	static double rootCalculation2(int delta, int a, int b) {
		double root12 = (-b - Math.sqrt(delta)) / (2 * a);
		return root12;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quadratic x = new Quadratic();

		// get input of a,b,c from user

		System.out.println("Enter value of a");
		int a = sc.nextInt();
		System.out.println("Enter value of b");
		int b = sc.nextInt();
		System.out.println("Enter value of c");
		int c = sc.nextInt();

		// Methods calling

		int delta = deltaCalculation(a, b, c);
		double root1 = rootCalculation1(delta, a, b);
		double root2 = rootCalculation2(delta, a, b);

		// Prints the Value

		System.out.println("Delta = " + delta);
		System.out.println("Root1 = " + root1);
		System.out.println("Root2 = " + root2);

	}
}
