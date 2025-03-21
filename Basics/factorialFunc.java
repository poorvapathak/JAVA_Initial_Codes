/* import java.util.*;                                                //My own code (runs but not nice)
public class FactorialFunc {
    public static int calculateFact(int a){
             if(a<0){
                System.out.println("Factorials must be positive");         // print should not be done here, its not good
             }                                                             // later try exception handling for this case
             else if(a==0){
                System.out.println("Factorial of zero is 1");              // instead use return 1 and atlast return num 
             }
             else{int num = 1;
                for(int i=a;i>=1;i--){
                    num=num*i;
                }System.out.println("Factorial of the number is: "+num);
             }return 0;}                                                //wrong return type as it always returns zero
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc=new Scanner(System.in);                              // judge by chatGPT
        int a = sc.nextInt();
        
        System.out.println(calculateFact(a));
}} */

// Shraddha didi's code

//Revised advanced code by chatGPT

import java.util.*;

public class factorialFunc {
    public static int calculateFact(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Factorials must be positive");
        } else if (a == 0) {
            return 1;
        } else {
            int num = 1;
            for (int i = a; i >= 1; i--) {
                num *= i;
            }
            return num;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int a = sc.nextInt();

            try {
                int result = calculateFact(a);
                System.out.println("Factorial of the number is: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

/*
 // Shraddha's code
 public static void printFactorial(int n) {
  if (n < 0) {
    System.out.println("Invalid Number");
    return;
  }

  int factorial = 1;
  for (int i = n; i >= 1; i--) {
    factorial = factorial * i;
  }
  System.out.println(factorial);
}

public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int n = sc.nextInt();
  printFactorial(n);
}

 */