import java.util.Scanner;

public class max_ele_row {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Sabhi row ke maximum me se minimum
        int overallMin = Integer.MAX_VALUE;

        // each row ka maximum
        for (int i = 0; i < n; i++) {

            int rowMax = arr[i][0];

            for (int j = 1; j < n; j++) {

                if (arr[i][j] > rowMax) {
                    rowMax = arr[i][j];
                }
            }

            // row maximum ko overall minimum se compare karo
            if (rowMax < overallMin) {
                overallMin = rowMax;
            }
        }

        System.out.println("Answer = " + overallMin);
    }
}