package linearSearch;

public class SearchInArray {
    public static void main(String[] args) {

        int[] nums = { 12, 234, 12, 3, 1434, 13, 4, 1, 19 };
        int target = 134;

        System.out.println(search(nums, target));
        System.out.println(search1(nums, target));
    }

    // return boolean if num dosent exist
    private static boolean search(int[] nums, int target) {

        if (nums.length == 0) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
        }

        // ===== Enhanced for loop =====
        // for (int num : nums) {
        // if (num == target) {
        // return true;
        // }
        // }

        return false;
    }

    // return -1 if num dosent exist
    private static int search1(int[] nums, int target) {

        if (nums.length == 0) {
            return -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
