import java.util.Scanner;

public class row_with_max_sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // rows and columns input
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        // array input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxSum = 0;
        int maxRow = -1;

        // find row with maximum sum
        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = 0; j < m; j++) {
                sum = sum + arr[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }

        System.out.println("Maximum Sum = " + maxSum);
        System.out.println("Row = " + maxRow);
    }
}
