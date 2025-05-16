import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Utils {

    public static int[] getArrayInput(Scanner sc){
        System.out.print("Enter number of elements : ");
        int n =  sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter Elements : " );
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void printArray(int[]  arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}
