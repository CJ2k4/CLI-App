import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n=== Mini Coding Library ===");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Merge Sort");
            System.out.println("4. Linear Search");
            System.out.println("5. Binary Search");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice){
                case 1:
                case 2:
                case 3:
                    int[] arr = Utils.getArrayInput(sc);
                    long start = System.nanoTime();

                    if(choice == 1) SortingAlgorithms.bubbleSort(arr);
                    else if (choice == 2) SortingAlgorithms.selectionSort(arr);
                    else SortingAlgorithms.mergeSort(arr, 0, arr.length - 1);

                    long end = System.nanoTime();

                    Utils.printArray(arr);

                    System.out.println("Time Taken : " + (end - start) + " ns");

                    break;

                case 4:
                case 5:
                    int[] search  = Utils.getArrayInput(sc);
                    System.out.print("Enter Element to search : ");
                    int key = sc.nextInt();
                    int result;

                    long start1 = System.nanoTime();

                    if(choice == 4){
                        result = SearchingAlgorithms.linearSearch(search, key);
                    }else{
                        Arrays.sort(search);
                        result = SearchingAlgorithms.binarySearch(search, key);
                    }
                    long end1 = System.nanoTime();
                    System.out.println(result == -1 ? "Element Not Found" : "Element Found at index " + result);
                    break;

                case 6:
                    System.out.println("Exiting ...");
                    break;

                default:
                    System.out.println("Invalid choice ...");
            }
        }while(choice != 6);
    }


}
