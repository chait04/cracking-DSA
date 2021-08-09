package firstProgram;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Temp in C:");

        float tempInCel = in.nextFloat();

        float tempInFar = (tempInCel * 9 / 5) + 32;
        System.out.println("Temp in Far: " + tempInFar);
    }
}
