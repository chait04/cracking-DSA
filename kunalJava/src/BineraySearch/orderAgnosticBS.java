package BineraySearch;

public class orderAgnosticBS {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 4, 53, 55, 60, 67, 2412, 43253 };
        int arr[] = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
        int target = 15;
        System.out.println(binarySearch(arr, target));
    }

    // first check if the given array is in accending/ decending order
    // to check that we can campare first two elements
    // but suppose first two elements are same then this will not work ex:
    // 3,3,3,4,6,9,12,14
    // so we'll compare first and last element of array
    static int binarySearch(int arr[], int target) {
        int len = arr.length;
        int start = 0, end = len - 1;

        // checking first and last if true--> storing boolean
        boolean check = arr[0] <= arr[len - 1];

        while (start < end) {
            int mid = start + (end - start) / 2;

            // if target is mid
            if (arr[mid] == target) {
                return mid;
            }

            // if this is true then it is accending order
            if (check) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // now this check is for decending order
            // 34,12,8,4,2,2,1 || target = 4;
            else {
                if (target > arr[mid]) {

                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            // return mid;
        }

        return -1;

    }
}
