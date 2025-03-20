public class type_casting {
    public static void main(String[] args) {
    
    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 50_000;   // underscore acts like how we put commas in between numbers
    float f = 5.67f;
    double d = 0.1234;
    double result = (f * b) + (i / c) - (d - s);

System.out.println((f * b) + "   " + (i / c) + "   " + (d - s));  //to see the steps of how individually each is performed
    // float * byte = float     int / char = int     double - short = double
System.out.println(result); // will be in double though others are of different type because it is of hightes bytes in all
}}


// also if we want to type int a = 1,000,000 but commas will give error
// so use underscores, they are allowed       int a = 1_000_000 (like this)