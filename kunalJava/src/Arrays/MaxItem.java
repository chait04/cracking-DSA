package Arrays;

public class MaxItem {
    public static void main(String[] args) {
        int arr[] = { 3, 31, 122, 4 };

        // System.out.println(maxArr(arr));
        System.out.println(maxRange(arr, 1, 3));

        // maxArr(arr);
    }

    // max element in array
    static int maxArr(int arr[]) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // System.out.println(max);
        return max;
    }

    // max element in range of that array
    static int maxRange(int arr[], int start, int end) {
        // edge cases
        if (arr.length == 0)
            return -1;

        int max = arr[0];

        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // System.out.println(max);
        return max;
    }
}
