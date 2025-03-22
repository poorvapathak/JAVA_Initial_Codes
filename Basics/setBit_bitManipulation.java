//set the 2nd bit of n = 0101, i.e. 5 of decimal.
// hence now it should be 0111, i.e. 7 of decimal.

public class setBit_bitManipulation {
    public static void main(String[] args) {
        int n = 5; // binary is 0101
        int pos = 1; // position (from right side) that we need to set in the number n
        // pos starts from 0 from R.H.S., hence pos = 1 means 2nd from right side that is 0 here
        int bitMask = 1<<pos; // left shift 1 by pos times (here it gets to binary now)
        
        if ((bitMask & n) == 0) { 
            n = n | bitMask; // set the bit at position pos to 1
            System.out.println(n);
           } else {
            System.out.println("Bit is already 1");
           }
    }
}
// to directly print in binary we can use Integer.toBinaryString(n) method