import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.nextLine();

        switch (fruit) {                             // switch and pass an argument/ variable in it
            case "Apple":
            System.out.println("red fruit");
            break;                                   // put break so that if satisfied it does not go ahead and save time
            case "Orange":
            System.out.println("orange fruit");
            break;
            case "Jackfruit":
            System.out.println("big fruit");
            break;
            default:
            System.out.println("invalid name");      // no need of break after this default statement
}}}   

/*
// Advanced switch   ( suported only Java 14 onwards )
//( when you press atl+enter while clicking on the word switch from the previous code  )
import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.nextLine();

        switch (fruit) {                             
            case "Orange" -> System.out.println("orange fruit");     
            case "Apple" -> System.out.println("red fruit");   
            case "Jackfruit" -> System.out.println("big fruit");   
            default -> System.out.println("invalid name");   
}}}   
*/