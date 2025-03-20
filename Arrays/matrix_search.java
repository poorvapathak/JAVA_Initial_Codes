//take a matrix as input from the user and search for a given number x in that and print its indices (row,column)
import java.util.*;
public class matrix_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int rows = sc.nextInt();
        System.out.println("enter no of columns");
        int cols = sc.nextInt();

        int matrix [][] = new int [rows][cols];
        System.out.println("enter the elements of the matrix");

        //input
        for (int i=0; i < rows; i++){
            for (int j=0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        //print the matrix
        System.out.println("The entered matrix is:");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j< cols; j++){
                System.out.print(matrix[i][j] + " ");}
            System.out.println(); }

        System.out.println("enter elemnt to search for in the given matrix");
        int x = sc.nextInt();

        //searching for a given number
        for (int i=0; i < rows; i++){
            for (int j=0; j < cols; j++){
                if(matrix [i][j]==x) {
                    System.out.println("element found at indices("+ i + "," + j+")");  
                }}}
}}
// this code gives the index according to java
// if you want the index to be given like maths then do +1 to it before printing it