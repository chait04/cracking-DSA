package contitional_loops;

//  Q:- reverse the given num...

//  in this the approach will be the same as of last question
//  we just want to add the number into our count, to do that 
//  we'll do -> count = count * 10 + remender..

public class ReverseNum {
    public static void main(String[] args) {
        int num = 123456;

        int ans = 0;

        while (num > 0) {
            int rem = num % 10; // to get last digit of number
            num /= 10; // to remove last digit of number
            ans = ans * 10 + rem; // 0 * 10 + 6 = 6
        }

        System.out.println(ans);
    }
}
