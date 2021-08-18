package BineraySearch;

public class BinaryBS {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 52, 55 };
        int target = 3;
        System.out.println(binarySearch(arr, target));
    }

    // returning the index of element in array
    static int binarySearch(int arr[], int target) {
        int len = arr.length;
        int start = 0, end = len - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            System.out.println(mid);
            // if (arr[mid] == target) {
            // return ans = arr[mid];
            // }

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
                System.out.println("start " + start + " end " + end);
            } else {
                return mid;
            }
        }

        return arr[end];
    }

    static int binarySearch2(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

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
