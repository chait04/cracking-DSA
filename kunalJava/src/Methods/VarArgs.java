package Methods;

import java.util.Arrays;

public class VarArgs {

    // varArgs is like rest operator in JS
    public static void main(String[] args) {
        fun(2, 3, 1, 3, 1, 31);
        multiple(21, 2, "@", "sad", "sd");
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String... v) {
        System.out.println();
    }
}
