package linearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 3, 2, 1 } };
        maxWealth(arr);
    }

    static void maxWealth(int[][] arr) {
        int maxWelthNum = 0;
        for (int person = 0; person < arr.length; person++) {
            int sumOfAcc = 0;
            for (int account = 0; account < arr[person].length; account++) {
                sumOfAcc += arr[person][account];
            }
            if (sumOfAcc > maxWelthNum) {
                maxWelthNum = sumOfAcc;
            }
        }
        System.out.println(maxWelthNum);
    }
}
