package BineraySearch;

import java.util.Arrays;

public class Questions {

    // 3 easy questions:----------------
    // 1. return ceiling number from array
    // 2. return floor of target num from arr
    // 3. return next greatest letter from arr
    // 4. Find First and Last Position of Element in Sorted Array

    public static void main(String[] args) {

        // 0 1 2 3 4 5 6
        // int arr[] = { 2, 3, 5, 8, 14, 16, 18 };
        char arr2[] = { 'c', 'f', 'j' };
        int arr3[] = { 5, 7, 7, 8, 8, 10 };

        // int target = 8;
        char target2 = 'c';
        int target3 = 7;
        // System.out.println(findFloor(arr, target));
        // System.out.println(findCeiling(arr, target));
        System.out.println(nextGreatestCharacter(arr2, target2));

        // System.out.println(Arrays.toString(searchRange(arr3, target3)));
    }

    // find the index of greatest number smaller than target (num <= target)
    static int findFloor(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

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
        return arr[end];
    }

    // find the index of smallest number greater than target (num >= target)
    static int findCeiling(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

        // if target is not exist in arr then retrun -1 means agr target itna bda hai ki
        // last element se bhi bda hai then -1
        if (target > arr[arr.length - 1]) {
            return -1;
        }

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
        return arr[start];
    }

    // find next greater char in array
    // 1. as we saw we return start when we want the small greatest element
    // 2. conditon is when elment is not in array then retrun first element of arr
    static char nextGreatestCharacter(char letters[], char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

    // Find First and Last Position of Element in Sorted Array
    public static int[] searchRange(int[] nums, int target) {

        int[] ans = { -1, -1 };
        // check for first occurence
        ans[0] = binarySearch(nums, target, true);

        // check for 2nd occurence
        ans[1] = binarySearch(nums, target, false);

        return ans;
    }

    // this function returns index of 1&2 occurences
    static int binarySearch(int nums[], int target, boolean firstOcc) {
        // taking ans = -1 coz if nothing is found then we will return -1;
        int start = 0, end = nums.length - 1, ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (firstOcc) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
