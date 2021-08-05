import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        // if (num == 4) {
        //     return;
        // }

        int temp = 2;
        if (num <= 1) {
            System.out.println("Is Not prime");
            return;
        } else {
            if (num % temp == 0) {
                System.out.println("Is prime");
            } else {
                System.out.println("Is not prime");

            }
            // temp++;
        }
    }
}
