/*
       *
      ** 
     ***
    ****
*/
public class rotated_inverted_half_pyr{
        public static void main(String[] args) {
            int n = 4;
            for (int i=1;i<=n;i++) {
                for (int j=1;j<=(n-i);j++) {
                    System.out.print(" ");
        }for(int j=1; j<=i; j++) {  //we can use j again as the scope of the variable inside for loops --
            System.out.print("*"); //-- is limited to that loop only
        }System.out.println();
    }}}  //3 loops in all
