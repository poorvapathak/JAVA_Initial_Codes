// to find the max of the given three numbers
import java.util.Scanner;
public class max_fun {
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        Scanner in = new Scanner(System.in);    // use this only one time and just put in.nextInt each time with ner name
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter third number: ");
        int num3 = in.nextInt();
        
        // method-1 using conditionals
       /* int max = num1;
        if (num2>max){
            max = num2;
        }
        if (num3>max){
            max = num3;
        } */

        // method-2 using max function
        int max = Math.max(num3, Math.max (num1, num2));

        System.out.println("Greatest number is: " + max );}}
