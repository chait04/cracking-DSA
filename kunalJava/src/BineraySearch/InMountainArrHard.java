package BineraySearch;

public class InMountainArrHard {
    public static void main(String[] args) {

    }

    static int search(int arr[], int target) {
        int peak = peekIndexMountainArr(arr);
        int firstTry = orderAgnosticsBinarySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticsBinarySearch(arr, target, peak + 1, arr.length - 1);
    }

    // bitonic arr / mountain arr
    // this will give us peak of array
    static int peekIndexMountainArr(int[] arr) {
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

    // search
    static int orderAgnosticsBinarySearch(int arr[], int target, int start, int end) {
        int len = arr.length;
        // int start = 0, end = len - 1;

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
