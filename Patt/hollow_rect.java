import java.util.Scanner;

public class hollow_rect {
    public static void main(String[] args) {
        System.out.print("Enter number of rows: ");
        Scanner row = new Scanner(System.in);
        int height = row.nextInt();

        System.out.print("Enter number of columns: ");
        Scanner col = new Scanner(System.in);
        int width = col.nextInt();

        System.out.println("Hollow Rectangle Pattern: ");
        for (int i = 1; i <=height; i++) {
            for (int j = 1; j <= width; j++) {
                // Print '*' for the border cells and ' ' for the hollow part
                if (i == 1 || i == height  || j == 1 || j == width ) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();  
            //above line to move the cursor to the next line otherwise rectangle will not form and all *s in single line
        }
    }
}
