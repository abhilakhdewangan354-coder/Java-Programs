import java.util.Scanner;

public class count_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 1;

        char[] arr = new char[n];

        for(int i = 0;i<n;i++) {
            arr[i] = sc.next().charAt(0);
        }

        for(int i = 1;i<arr.length;i++) {
            if(arr[i] == arr[i-1]) {
                count++;
            }
            else {
                System.out.println(arr[i-1] + "=" + count);
                count = 1;
            }
             
        }
       System.out.println(" " + arr[n-1] + "=" + count);

    }
}