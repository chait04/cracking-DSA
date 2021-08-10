package contitional_loops;

// find how many times given number repeats in num
// ex: - 1234323 = 3 occured 3 times

public class CountOccurences {
    public static void main(String[] args) {
        // count the number of times 2 occured in given num
        int num = 2322132;
        int count = 0;

        while (num > 0) {
            int remender = num % 10;
            if (remender == 2) {
                count++;
            }
            num = num / 10; // this will remove last digit from given num
        }
        System.out.println(count);

    }
}
