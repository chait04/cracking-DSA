package linearSearch;

import java.lang.annotation.Target;

public class searchIn2dArr {
    public static void main(String[] args) {

        int[][] arr = { { 3, 21, 43 }, { 1232, 31, 1 }, { 1, 2, 3 }, { 4, 56, 874 } };
        int target = 1232;

        search(arr, target);
        System.out.println(searchMax(arr));
        ;
    }

    // find element in 2D arr
    private static void search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    System.out.println(row + " " + col);
                }
            }
        }
        System.out.println("Not found");
    }

    // search max ele in 2d arr
    private static int searchMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

}
