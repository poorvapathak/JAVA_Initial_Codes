import java.util.*;
public class nested_switch {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in); Scanner out = new Scanner(System.in)) {
            String animalType = in.nextLine();
            String animal = out.nextLine();

            switch (animalType) {
                case "Mammal" -> {
                    switch (animal) {
                        case "Dog" -> System.out.println("This is a Dog. Dogs are loyal.");
                        case "Cat" -> System.out.println("This is a Cat. Cats are independent.");
                        default -> System.out.println("Unknown mammal.");
                    }
                }

                case "Bird" -> {
                    switch (animal) {
                        case "Eagle" -> System.out.println("This is an Eagle. Eagles are strong.");
                        case "Sparrow" -> System.out.println("This is a Sparrow. Sparrows are small.");
                        default -> System.out.println("Unknown bird.");
}
                }

                default -> System.out.println("Unknown animal type.");
}
        }}}


        /*
        Tradistional way of writing the code for switch, but now above I used the 
        switch rule which is available after Java 12
        It has different syntax using arrows.

        switch (animalType) {
                case "Mammal":
                    switch (animal) {
                        case "Dog":
                            System.out.println("This is a Dog. Dogs are loyal.");
                            break;
                        case "Cat":
                            System.out.println("This is a Cat. Cats are independent.");
                            break;
                        default:
                            System.out.println("Unknown mammal.");
                    }
                    break;

                case "Bird":
                    switch (animal) {
                        case "Eagle":
                            System.out.println("This is an Eagle. Eagles are strong.");
                            break;
                        case "Sparrow":
                            System.out.println("This is a Sparrow. Sparrows are small.");
                            break;
                        default:
                            System.out.println("Unknown bird.");}
                    break;

                default:
                    System.out.println("Unknown animal type.");}
        } 
                    */