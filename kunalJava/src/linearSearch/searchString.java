package linearSearch;

public class searchString {
    public static void main(String[] args) {
        String name = "chaitanya";
        char c = 'd';

        System.out.println(search(name, c));
    }

    private static boolean search(String name, char c) {
        if (name.length() == 0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == c) {
                System.out.println("present");
                return true;
            }
        }
        System.out.println("absent");
        return false;
    }
}
