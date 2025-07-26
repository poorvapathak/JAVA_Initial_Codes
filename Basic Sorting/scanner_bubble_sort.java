import java.util.Scanner;

public class scanner_bubble_sort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Input the size of the array
        try (Scanner sc = new Scanner(System.in)) {
            // Input the size of the array
            System.out.print("Enter the size of the array:");
            int n = sc.nextInt();
            int arr[] = new int[n]; // Declare the array
            System.out.println("Enter the elements of the array:");  //Ask user to input elements
            for(int i =0; i<n; i++){
                arr[i] =sc.nextInt();
            }   // Bubble Sort Algorithm
            for(int i=0; i<arr.length-1;i++){
                for(int j=0; j<arr.length-i-1; j++){
                    if(arr[j] > arr[j+1]){
                        //swap
                        int temp = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }   System.out.println("Sorted array:");
            printArray(arr);
            // Close the scanner to prevent resource leak
        }
    }
}
