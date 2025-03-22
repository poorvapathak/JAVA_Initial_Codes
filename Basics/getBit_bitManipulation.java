public class getBit_bitManipulation {
    public static void main(String[] args) {
        int n = 5; // binary of 5 is 0101
        int pos = 3; // position (from right side) that we need to find in the number n
        int bitMask = 1<<pos; // left shift 1 by pos times

        if ((bitMask & n) == 0) { // we use and of the given number n and the bitmask to know what was the bit at the position pos
         System.out.println("Bit is 0");
        } else {
         System.out.println("Bit is 1");
        }
    }
}
// this is the simplest bit manipulation code for "get bit" operation