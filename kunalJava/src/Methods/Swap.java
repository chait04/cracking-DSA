package Methods;

public class Swap {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;

        // int temp = a;
        // a = b;
        // b = temp;

        // System.out.println(a + " " + b);

        System.out.println("before calling function");

        swap(23, 3);
        int arr[] = { 2, 343, 121, 3, 31 };
        // here refrence copy will be passed, which will contain the same object
        swap2(arr);
        System.out.println(arr[0]);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " a : b " + b);
    }

    // this is passed by copy of value of refrence
    static void swap2(int a[]) {
        a[0] = 34;
        // if you make a change to the object via this ref variable, same object will be
        // changed
    }
}
