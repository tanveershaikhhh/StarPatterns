// Print this pattern using for loop and take input from user of number of rows and columns
//*****
//*****
//*****
//*****

package starpattern;
import java.util.*;

public class SolidRectangle {
    public static void main(String[] args) {

        // Taking input of rows
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows you want in the SolidRectangle pattern");
        int n = sc.nextInt();


        // Taking input of columns
        System.out.println("Please enter the number of rows you want in the SolidRectangle pattern");
        int m = sc.nextInt();

        for (int i= 1; i<=n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
