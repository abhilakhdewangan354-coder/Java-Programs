import java.util.Scanner;

public class symettric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean flag = true;

        if(m != n) {
            flag = false;
        }
        else {
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if(arr[i][j] != arr[j][i]) {
                        flag = false;
                    }
                }
            }
        }

        if(flag) {
            System.out.println("The matrix is Symmetric");
        }
        else {
            System.out.println("The matrix is not Symmetric");
        }
    }
}