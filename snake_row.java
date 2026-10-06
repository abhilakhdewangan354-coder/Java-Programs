import java.util.Scanner;

public class snake2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        // Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Snake pattern
        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {

                // Left to Right
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] + " ");
                }

            } else {

                // Right to Left
                for (int j = m-1 ; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }

            System.out.println();
        }
    }
}