package BineraySearch;

public class infiniteArr {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 10, 90, 10, 130, 140, 160, 170 };
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int arr[], int target) {
        int start = 0, end = 1;

        // target is not dependant on start
        // if it is greater than end then, we dont neeed to check if its greater than
        // staret
        // so just check while target > end double the length of new box
        while (target > arr[end]) {
            int temp = end + 1; // new start

            // double the box
            // end = prevEnd + sizeOfBox * 2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
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
