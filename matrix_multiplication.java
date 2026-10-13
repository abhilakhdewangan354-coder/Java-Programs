import java.util.Scanner;

public class multiply_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr1 = new int[m][n];

        for(int i =0;i<m;i++) {
            for(int j= 0;j<n;j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        int p = sc.nextInt();
        int q = sc.nextInt();

        int[][] arr2 = new int[p][q];

        for(int i = 0;i<p;i++) {
            for(int j = 0;j<q;j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        if(n!=p) {
            System.out.println("Matrix multiplication is not possible");
        }
        else {
            int[][] result = new int[m][q];

            for(int i = 0;i<m;i++) {
                for(int j = 0;j<q;j++) {
                    for(int k =0;k<n;k++) {
                        result[i][j] = result[i][j] + arr1[i][k]*arr2[k][j];
                    }
                }
            }

            for(int i = 0;i<m;i++) {
                for(int j = 0;j<q;j++) {
                    System.out.print(result[i][j]);
                }
                System.out.println();
            }
        }
    }
}