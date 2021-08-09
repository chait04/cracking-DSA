package contitional_loops;

import java.util.Scanner;

public class Fibo {

    // fibonacci numbers
    // sum of prev 2 nums- 0,1,1,2,3,4,5
    // find num at nth position

    // a | b
    // _______
    // 0 | 1
    // 1 | 2
    // 2 | 3ssssssssss
    // 3 | 5
    // 5 | 8

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int num = sc.nextInt();
            int a = 0;
            int b = 1;
            int count = 2;

            while (count <= num) {
                int temp = b;
                b = b + a;
                a = temp;
                count++;
            }
            System.out.println(b);
        } finally {
            sc.close();
        }
    }
}
