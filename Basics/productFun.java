import java.util.*;
public class productFun {
    public static int calculateProd(int a, int b){
        return a*b;      // directly mention product in return
    }
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b;
            try (Scanner sc2 = new Scanner(System.in)) {
                b = sc2.nextInt();
            }

            System.out.println("Product of the two numbers is: " +calculateProd(a,b));//directly like this as compared to prev one
        }
    }
}
