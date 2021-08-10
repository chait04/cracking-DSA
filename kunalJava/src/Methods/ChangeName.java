package Methods;

public class ChangeName {
    public static void main(String[] args) {
        String name = "Chaii";
        String newName = changeNaam(name);
        System.out.println(name);
        System.out.println(newName);
    }

    static String changeNaam(String naam) {
        naam = "kaju";
        return naam;
    }
}
