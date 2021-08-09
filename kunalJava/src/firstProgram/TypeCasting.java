package firstProgram;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        // float floatNum = input.nextFloat();
        // int num = input.nextInt();

        // System.out.println(floatNum);

        // float num = (int)(3441.324f);

        // int a = 258;
        // byte b= (byte)(a);

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        //
        // // here a,b is getting converted into int to store value bcoz their value is
        // 2000 and a byte can only store 256 byte.
        // int result = (a*b) / c;

        // int number = "A"; // it should give 97- ASCII value
        // int number = "a"; // it should give 65- ASCII value

        byte b = 23;
        char c = 'c';
        int i = 23;
        long l = 2323432l;
        short s = 3;
        float f = 34.23f;
        double d = 0.232323;

        double result = (f * b) + (i / c) - (d * s);

        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
