package Methods;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println(isPrime(num));
        System.out.println(kunalIsPrime(103));

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
