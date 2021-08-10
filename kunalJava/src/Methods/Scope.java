package Methods;

public class Scope {
    public static void main(String[] args) {
        int a = 34;
        {
            int b = 2;
            System.out.println(b);
            a = 45;
            System.out.println(a);
        }
        // System.out.println(b);
        int b = 3;
        System.out.println(b);

        System.out.println(a);

    }
}
