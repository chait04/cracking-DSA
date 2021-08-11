package Arrays;

import java.util.*;

public class arrListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        // list.add(34);
        // list.add(34);
        // list.add(34);
        // list.add(34);
        // list.add(34);
        // list.add(34);

        // int s = list.size();
        // list.contains(45);
        // System.out.println(list + " " + s);
        funArrList();
    }

    static void funArrList() {
        Scanner s = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialize
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        // for (int i = 0; i < 5; i++) {
        // for (int ii = 0; ii < 5; ii++) {
        // list.get(i).add(s.nextInt());
        // }
        // }
    }
}
