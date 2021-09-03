package FunctionProgramArray;
import java.util.Scanner;
public class Distance {

	
		// Function to calculate distance
		static double distance(int x1, int y1, int x2, int y2) {
			// Calculating distance
			return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
		}

		// Main method
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value of X");
			int x2 = sc.nextInt();
			System.out.println("Enter value of Y");
			int y2 = sc.nextInt();
			System.out.println(Math.round(distance(0, 0, x2, y2) * 100000.0) / 100000.0);
		}
	}
