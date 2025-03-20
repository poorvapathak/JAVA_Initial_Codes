import java.util.*;
public class function {

    //declaring the function called printMyName with void return type outside the main function
    public static void printMyname(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        System.out.print("Enter the name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyname(name);         // calling the function in main with arguemnt
    }
}
