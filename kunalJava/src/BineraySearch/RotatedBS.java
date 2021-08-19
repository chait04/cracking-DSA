package BineraySearch;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 6;
        // System.out.println(findPivot(arr));
        // System.out.println(search(arr, target));
        // System.out.println(peekIndexMountainArrToFindPivot(arr));
    }

    // finally calliing searching functions
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // in case array is not rotated then its a simple sorted arrays so
        if (pivot == -1) {
            // just do normal BS
            return bineraySearch(nums, target, 0, nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return bineraySearch(nums, target, 0, pivot - 1);
        }

        return bineraySearch(nums, target, pivot + 1, nums.length - 1);
    }

    // simple binary Search after doing pivot
    static int bineraySearch(int[] nums, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    // function to find find pivot
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 cases
            // added mid < end cuz , agr mid last elem hai to jbb mid + 1 karenge tbb out of
            // bound weeoe aajeyga, so aadeed mid < end&&.
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // now same thing as above agr ele first rha the mid -1 karenge tbb out of bound
            // ho jayega, so added one more condition there---> mid > start&&
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // mountain peek method to find pivot
    static int peekIndexMountainArrToFindPivot(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // then you are in decrement part of arrays
                // this might be your answer , but look at left also...
                // this is why end !== mid- 1
                end = mid;
            } else {
                start = mid + 1; // now here we are incrementing coz
                // coz we know that ( mid + 1 ) ele > mid element
                System.out.println(start);
            }
        }

        return start;// ore end coz both are same...
    }
}
