import java.util.Scanner;

public class spirally_traversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for(int i = 0;i<m;i++) {
            for(int j = 0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

    int top = 0;
    int bottom = m-1;
    int left = 0;
    int right = n-1;

        while(top<=bottom && left<=right) {
            for(int j=left;j<=right;j++) {
                System.out.println(arr[top][j]);
            }
            top++;

            for(int i = top;i<=bottom;i++) {
                System.out.println(arr[i][right]);
            }
            right--;


            if(top<=bottom) {
            
                for(int j = right;j>=left;j--) {
                System.out.println(arr[bottom][j]);
            }
            bottom--;
            }
            

            if(left<=right) {
                for(int i = bottom;i>=top;i--) {
                System.out.println(arr[i][left]);
            }
            left++;
            }
            
        }

    }
}