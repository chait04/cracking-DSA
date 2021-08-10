package Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().trim();

        switch (str) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "kaju":
                System.out.println("devsnest Fellow");
                break;
            default:
                System.out.println("ahh chaii here");
        }
        sc.close();
    }
}
