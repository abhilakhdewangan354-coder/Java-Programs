import java.util.Scanner;

public class sum_of_diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for(int i=0;i<m;i++) {
            for(int j =0;j<n;j++) {
                arr[i][j] = sc.nextInt();

            }
        }

        int sum = 0;

        for(int i =0;i<m;i++) {
            sum = sum + arr[i][i];

            sum = sum + arr[i][n-i-1];

        }
        System.out.println("Sum of the digonals = " + sum);
    }
}