package linearSearch;

public class searchRange {
    public static void main(String[] args) {

        // find element in some particular range
        // ex = [3,23,1,4141,,1]
        // find in index (1,4)
        int[] nums = { 12, 234, 12, 3, 1434, 13, 4, 1, 19 };
        int target = 3;

        System.out.println(search(nums, target, 1, 4));
    }

    private static boolean search(int[] nums, int target, int start, int end) {

        if (nums.length == 0) {
            return false;
        }

        for (int i = start; i <= end; i++) {
            if (nums[i] == target) {
                return true;
            }
        }

        return false;
    }

}
