package FunctionProgramArray;
import java.util.Scanner;
public class SumOfThreeIntegerZero {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");

        int sizeOfArray = sc.nextInt();
        int [] arr = new int[sizeOfArray];

        System.out.println("Enter the elements in array : ");

        for(int i = 0;i < sizeOfArray ; i++ ){

            arr [i] = sc.nextInt();

        }

        int len = arr.length;
        findAllTriplets(arr,len);

    }
    public static void findAllTriplets(int [] arr,int len){

        boolean foundTriplet = false;  
        int tripletCount = 0;
        for (int i = 0 ; i < len-2 ; i++){   
            for (int j = i+1 ; j < len-1 ; j++){

                for (int k = j+1 ; k < len ; k++){

                    if(arr[i] + arr[j] + arr[k] == 0){

                        tripletCount++;
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        foundTriplet = true;

                    }

                }

            }

        }
        System.out.println("The total number of triplets are : "+tripletCount);
        if(!foundTriplet)
            System.out.println("No triplets in the following series");

    }
}

