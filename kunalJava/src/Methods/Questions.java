package Methods;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println(isPrime(num));
        System.out.println(kunalIsPrime(29));

        // call the armstrong num
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                // System.out.print(i + " ");
            }

        }
    }

    // print all 3 digits armstrong numbers
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            rem = rem * rem * rem;
            n /= 10;
            sum = sum + rem;
        }

        return sum == original;
    }

    // Chaianya code- LOL THIS CODE IS JUST CHECKING ODD/EVEN
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int check = 2;

        if (n % check == 0) {
            return false;
        } else {
            return true;
        }

    }

    // kunals isPrime
    static boolean kunalIsPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int check = 2;

        // using while loop coz we wanted to check, if mod of numbers less than 4 is
        // equal to 0 or not.
        // first check 2 % num == 0
        // seconf check 3 % num ==0
        // these are the only two conditions, we are cheking
        while (check * check <= n) {
            if (n % check == 0) {
                return false;
            }
            check++;
            System.out.println(check);
        }
        System.out.println(check);
        System.out.print(check * check + " " + n);
        return check * check > n;
    }

}
