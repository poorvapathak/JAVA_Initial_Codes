import java.util.*;
public class nested_switch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String animalType = in.nextLine();
        Scanner out= new Scanner(System.in);
        String animal = out.nextLine();

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
                System.out.println("Unknown animal type.");}}}
