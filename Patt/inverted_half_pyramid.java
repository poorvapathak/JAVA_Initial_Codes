/*/ ****
    ***
    **
    *
/*/

public class inverted_half_pyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i=1;i<=n;i++) {
            for (int j=i;j>=1;j--) {
                System.out.print("*");
    }System.out.println();
}}}

/*Alternate option is to change the outer loop----> so basically change any loop to decreament either outer or inner
for (int i=1;i<=n;i++) {
            for (int j=i;j>=1;j--) {
                System.out.print("*");
    }System.out.println();
} */