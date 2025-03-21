import java.util.*;
public class nested_switch2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int day = in.nextInt();

            switch (day) {
                case 1 -> System.out.println("Monday - Weekday");
                case 2 -> System.out.println("Tuesday - Weekday");
                case 3 -> System.out.println("Wednesday - Weekday");
                case 4 -> System.out.println("Thursday - Weekday");
                case 5 -> System.out.println("Friday - Weekday");
                case 6 -> System.out.println("Saturday - Weekend");
                case 7 -> System.out.println("Sunday - Weekend");
                default -> System.out.println("Invalid day. Please enter a number between 1 and 7.");
            }
        }
    }
}

