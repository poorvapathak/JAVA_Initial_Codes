import java.util.*;
//Method 1 -- when size of array is known
/*public class array {
    public static void main(String[] args) {
        int marks [] = new int[3];   // Array declaration
        marks[0] = 98;   //marks of zeroth index are 98 (maths)
        marks[1] = 99; // chem
        marks[2] = 95; // phy

        for (int i = 0; i <= 2; i++) {
            System.out.println(marks[i]);    // Printing array elements
    }}}
*/

//Method 2 -- when size of array is taken from user
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        System.out.println("Enter the integer elements");
        int numbers[] = new int[size];    // Array declarations for the given size

        // input
        for (int i = 0; i < size; i++) {
            numbers[i]= sc.nextInt();}
        System.out.println("The entered array is:");
        //output
        for (int i = 0; i < size; i++ ){
            System.out.println(numbers[i]);
        }
    }
}