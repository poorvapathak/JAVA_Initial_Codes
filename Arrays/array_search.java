import java.util.*;
//Take an array from the user. Search for a given number x and print the index at which it occurs. (Linear search)
//This also works if the same element ocuurs multiple times in an array. It gives index of each in that case.
public class array_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int numbers[] = new int[size];

        for (int i = 0; i< size; i++){     
            numbers [i]=sc.nextInt();
        }

        System.out.println("enter the element you want to search:");
        int x = sc.nextInt();

        for (int i = 0; i< size; i++){                 // you can also use numbers.lenght in place of size here
            if(numbers[i] == x){
                System.out.println("Number foumd at the index: " + i);}   // if you put slse condition here for invalid 
        }}}                                                            // index then it will print that for all the rest
