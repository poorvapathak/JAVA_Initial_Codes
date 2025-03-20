import java.util.*;
public class sumFunction {
    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        Scanner sc2 =new Scanner(System.in);
        int b = sc2.nextInt();

        int sum=calculateSum(a, b);
        System.out.println("Sum of the two numbers is: " + sum);
    }
}
