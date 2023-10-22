package starpattern;

import java.util.*;

public class halfPyramidWithNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of pyramid lines you want to print ");
        int n = in.nextInt();

        System.out.println();
        System.out.println();
        System.out.println("Here is your HalfPyramid with Numbers");


        for (int i = 1; i<=n; i++ ){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
