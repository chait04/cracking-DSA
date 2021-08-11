package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] arr = { 1, 2, 3 };

        int[] arr2 = new int[5];

        // // System.out.println(arr2);
        arr2[0] = 32;
        arr2[1] = 42;
        arr2[2] = 322;

        // using for loops
        // for (int i = 0; i < arr2.length; i++) {
        // arr2[i] = s.nextInt();
        // }

        // for (int i = 0; i < arr2.length; i++) {
        // System.out.print(arr2[i]);
        // }
        // System.out.println(Arrays.toString(arr2));

        // string arrays
        // String[] strArr = new String[5];
        // for (int i = 0; i < strArr.length; i++) {
        // strArr[i] = s.next();
        // }

        // System.out.println(Arrays.toString(strArr));

        int[][] twoArr = new int[3][2];

        // input
        for (int row = 0; row < twoArr.length; row++) {
            for (int col = 0; col < twoArr[row].length; col++) {
                twoArr[row][col] = s.nextInt();
            }
        }

        // output:------------
        // for (int row = 0; row < twoArr.length; row++) {
        // for (int col = 0; col < twoArr[row].length; col++) {
        // System.out.print(twoArr[row][col] + " ");
        // }
        // System.out.println();
        // }

        // for in loop(wnhanced for loop):------------
        // for (int[] ar : twoArr) {
        // System.out.println(Arrays.toString(ar));

        // }

        // Normal output:------------
        // System.out.println(Arrays.toString(twoArr));
    }

}