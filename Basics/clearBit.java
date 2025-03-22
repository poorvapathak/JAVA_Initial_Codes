public class clearBit {
    public static void main(String[] args) {
        
        int n = 5;
        int i = 2;
        int mask = 1 << i; //Left shift
        mask = ~mask; // NOT operator
        n = n & mask; // AND operator
        System.out.println(n);
    }
}

/*
 
Shraddha's code:
public class clearBit {
    public static void main(String args[]) {
        int n = 5; // 0101
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}

 */