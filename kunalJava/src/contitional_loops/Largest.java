package contitional_loops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        // find the largest number

        Scanner sc = new Scanner(System.in);

        // int fNum = sc.nextInt();
        // int sNum = sc.nextInt();
        // int tNum = sc.nextInt();

        // 👇 largest num 👇

        // int max = 0;

        // if (fNum > max) {
        // max = fNum;
        // }
        // if (sNum > max) {
        // max = sNum;
        // }
        // if (tNum > max) {
        // max = tNum;
        // }

        // 👇 Smallest num 👇

        // int max = fNum;

        // if (max > sNum) {
        // max = sNum;
        // }
        // if (max > tNum) {
        // max = tNum;
        // }

        // 👇 largest num 👇

        // int max = Math.max(fNum, Math.max(sNum, tNum));
        // System.out.println(max);

        // 👇 Alphabet Case Check 👇
        char c = sc.next().trim().charAt(0);

        if (c >= 'a' && c <= 'z') {
            System.out.println("lowercase");
        } else {
            System.out.println("UPPERCASE");
        }

        sc.close();
    }
}
