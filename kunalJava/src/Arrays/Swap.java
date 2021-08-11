package Arrays;

import java.util.*;

public class Swap {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        // calling function
        // swap(arr, 1, 2);

        // System.out.println(Arrays.toString(arr));
        reverseArr(arr);
        // System.out.println(arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    // reverse array
    static void reverseArr(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        System.out.println(start + " " + end);

        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // swap
    static void swap(int arr[], int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }

}
