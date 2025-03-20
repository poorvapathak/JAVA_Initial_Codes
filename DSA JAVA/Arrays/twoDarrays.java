//General code of how to take the matrix input and print it
import java.util.*;
public class twoDarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter no of columns:");
        int cols = sc.nextInt();

        int matrix [][]= new int[rows][cols];
        
        //input
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
        }}
        System.out.println("Your entered matrix is:");
        //output 
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(matrix [i][j] + " ");}
                System.out.println();}    //remember to put next line in the for loop for rows and not in the columns loop
    }}
