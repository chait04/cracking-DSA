package contitional_loops;

import java.util.Scanner;

//  make calculator program

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;

        while (true) {
            System.out.println("Enter the operator: ");
            char sign = sc.next().trim().charAt(0);
            if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '%') {

                // take two numbers from user
                System.out.println("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (sign == '+') {
                    ans = num1 + num2;
                }
                if (sign == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (sign == '*') {
                    ans = num1 * num2;
                }
                if (sign == '-') {
                    ans = num1 - num2;
                }
                if (sign == '%') {
                    ans = num1 % num2;
                }
            } else {
                System.out.println("Invalid operator");
                break;
            }

            System.out.println(ans);
            break; // breaking as any calculation matches

        }

        sc.close();
    }

}
