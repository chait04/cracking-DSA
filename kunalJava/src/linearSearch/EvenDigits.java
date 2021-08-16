package linearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 33, 123, 2, 1235, 43 };
        System.out.println(findNumbers(nums));
    }

    // counting num of event numbers
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count++;
    }

    // function to check is number is even or not
    static boolean even(int num) {
        int numOfDigits = digits(num);
        return numOfDigits % 2 == 0;
    }

    // function to count no of digits
    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;

    }

}
