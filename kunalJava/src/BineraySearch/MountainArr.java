package BineraySearch;

public class MountainArr {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 34, 56, 34532, 61, 0 };
        System.out.println(peekIndexMountainArr(arr));

    }

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

        // // in the end =, start == end and pointing to the largest number of the 2
        // checks above
        // start and end are alaways trying to find max ele in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one bcoz
        // that is what the cheks say

        // mor elobpration:-
        // at every point of time for start and end, they have the best possible answer
        // till that time
        // and if we are saying only one item is remaining , hence cuz of above line
        // that is the best possible

        return start;// ore end coz both are same...
    }
}
