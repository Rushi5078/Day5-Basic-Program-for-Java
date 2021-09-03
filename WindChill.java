package FunctionProgramArray;
import java.util.Scanner;
public class WindChill {
	//Declare variable
	 static double t,v;
	 
	 //Declare function 
	static void playying() {
		
 double w=(35.74)+(0.6215*t)+((0.4275*t)-(35.75))*Math.pow(v,0.16);
			System.out.println(w);
		}
//main method
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
//user input part
			System.out.println("Enter Value of v");
			double v=sc.nextDouble();
			System.out.println("Enter Value of t");
	        double t=sc.nextDouble();
		//call to the function
			playying();
	
	
		}	
	
}
