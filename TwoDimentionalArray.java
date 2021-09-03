package FunctionProgramArray;
import java.util.Scanner;
public class TWoDArray {

	//main method
	  public static void main(String[] args) {
			//to get  input form user
		  System.out.print("Enter 2D array size : ");
	      Scanner sc=new Scanner(System.in);
	      int rows=sc.nextInt();
	      int columns=sc.nextInt();
	      
	      System.out.println("Enter array elements : ");    
	       //execution part
	      int twoD[][]=new int[rows][columns];
		for(int i=0; i<rows;i++)
	        {            
	           for(int j=0; j<columns;j++)
	           {
	               twoD[i][j]=sc.nextInt();
	           }
	        }
	       System.out.print("Array you entered : \n");
	      for(int i=0; i<rows;i++)
	       {            
	          for(int j=0; j<columns;j++)
	          {
	            System.out.print(twoD[i][j]+" ");
	          }
	       System.out.println();
	       }
	      
	}
	}
