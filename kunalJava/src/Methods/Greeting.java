package Methods;

/**
 * Greeting
 */
public class Greeting {
    public static void main(String[] args) {
        // greet();
        // String msg = greet2();
        String greetMsg = greet3("Mission passed");
        System.out.println(greetMsg);
    }

    public static void greet() {
        System.out.println("This is greeting");
    }

    static String greet2() {
        String msg = "THIs is Greeting From Function which return String";
        return msg;
    }

    static String greet3(String msg) {
        String value = "This is from greet 🎫" + msg;
        return value;
    }
}