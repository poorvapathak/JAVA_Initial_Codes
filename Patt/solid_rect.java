import java.util.*;
public class solid_rect {
    public static void main(String[] args) {

        System.out.print("Enter number of rows: ");
        try (Scanner row = new Scanner(System.in); Scanner col = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int n = row.nextInt();

            System.out.print("Enter number of columns: ");
            int m = col.nextInt();

        System.out.println("Solid Rectangle Pattern: ");
        for(int i =1; i<=n; i++) {
            for(int j =1; j<=m; j++) {
                System.out.print("*");       
    }System.out.println();
}
}
    }
}