public class butterfly {
    public static void main(String[] args) {
        int n = 4;
        //upper half
        for(int i = 1; i <= n; i++) {
            for(int j =1; j <= i; j++) {
                System.out.print("*"+" ");    //first half
        } int spaces=2*(n-i);
        for(int j=1; j <= spaces; j++){
            System.out.print(" "+" ");         //spaces
        }for(int j=1; j <= i; j++) {
            System.out.print("*"+" ");}        //second half
         System.out.println();

    }


    // lower part (just change i of upper to decreament)
    for(int i = n; i >= 1; i--) {
        for(int j =1; j <= i; j++) {
            System.out.print("*"+" ");    //first half
    } int spaces=2*(n-i);
    for(int j=1; j <= spaces; j++){
        System.out.print(" "+" ");         //spaces
    }for(int j=1; j <= i; j++) {
        System.out.print("*"+" ");}         // second half
     System.out.println();

}
}}

/*  upper half
*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * * 


first half
*              
* *            
* * *         
* * * *    
* * * * *

then spaces


then second half
                  * 
                * * 
              * * * 
            * * * * 
          * * * * * 

then lower part
* * * * * * * * * * 
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 * 


butterfly
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *

*/