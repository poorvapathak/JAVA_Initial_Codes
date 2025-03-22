import java.util.Scanner;

public class updateBitManipulation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the operation you want to perform (1 for set and 2 for clear): ");
            int operation = sc.nextInt();
            // if operation entered = 1, perform set
            // if poeration entered = 2, perform clear
            int n = 5; // 0101
            int pos = 1; // we have zero at pos 1. so if we set then it will become 1 else on clear it will remain same, i.e. 5

            int bitMask = 1 << pos;
            if (operation ==1){
                //set
                int newNumber = n | bitMask;
                System.out.println(newNumber);
            }
            else{
                //clear
                int newNumber = n & ~bitMask;
                System.out.println(newNumber);
            }
        }
    }
    
}
