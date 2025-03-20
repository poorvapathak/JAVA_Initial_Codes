//Subtraction Method to find GCD
import java.util.*;
public class gcd{
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();
       while(n1 != n2) { 
           if(n1>n2) {
               n1 = n1 - n2;
           } else {
               n2 = n2 - n1;
           }}
       System.out.println("GCD is : "+ n2); }}

/*
//Division Method to find GCD (this is better than the above method)
import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: "); // Prompt user for input
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        int gcd = findGCD(n1, n2); // Calculate GCD
        System.out.println("GCD is: " + gcd);   // Print the result
    }
    // Method to calculate GCD using the division-based Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;}
        return a; }}
*/