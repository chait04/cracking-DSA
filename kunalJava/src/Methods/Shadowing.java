package Methods;

public class Shadowing {
    static int x = 423;

    // shadowing is using same variables in diff scopes
    // low level shadowed by upper level
    // declaring same var name in inner block scope, when we do that the uppar level
    // block var becomes hidden means get shadowed;

    public static void main(String[] args) {
        System.out.println(x);

        int x = 34; // the class var @ line 4 is shadowed by this var
        System.out.println(x);

    }
}
