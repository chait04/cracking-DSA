package Arrays;

public class ColNoFixedSize {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 32, 12, 3 }, { 311, 2 } };

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                // System.out.print(arr[r][c] + " ");
                System.out.print(arr[r][c]);
            }
            System.out.println();
        }
    }
}
