package Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // sum();
        // int ans = sum2();
        int plus = sum3(23, 2);
        System.out.println(plus);
    }

    // This returns nothing
    public static void sum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Num: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second Num: ");
        int num2 = sc.nextInt();

        // way to print two variables in a line;
        System.out.format("nums are %s, %s ", num1, num2);
    }

    // This returns integer
    static int sum2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Num: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second Num: ");
        int num2 = sc.nextInt();

        int ans = num1 + num2;
        return ans;
    }

    // Function which takes arguments;
    static int sum3(int a, int b) {
        int ans = a + b;
        return ans;
    }
}
