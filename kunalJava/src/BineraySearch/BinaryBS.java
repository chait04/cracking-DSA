package BineraySearch;

public class BinaryBS {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 53, 55, 60, 67, 2412, 43253 };
        int target = 53;
        System.out.println(binarySearch(arr, target));
    }

    // returning the index of element in array
    static int binarySearch(int arr[], int target) {
        int len = arr.length;
        int start = 0, end = len - 1, ans = Integer.MIN_VALUE;

        while (start < end) {
            int mid = start + end / 2;

            // if (arr[mid] == target) {
            // return ans = arr[mid];
            // }

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
