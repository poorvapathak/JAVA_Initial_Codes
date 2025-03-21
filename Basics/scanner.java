import java.util.*;
public class scanner {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            String name= sc.nextLine();
            System.out.println("You entered "+name);
        }}} 

/*
    Why we need to close the scanner object?

    Scanner class implements Closeable interface.
    It has a close() method which releases the resources used by the scanner object.
    If we don't close the scanner object, it may lead to resource leak.
    Resource leak is a situation where a program doesn't release the resources after using them.
    It may lead to memory leak or other issues.

    So, it is always recommended to close the scanner object after using it.
    We can close the scanner object using sc.close() method.

 */