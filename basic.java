import java.util.Scanner;

public class basic {

    public static int print(int n) {
        return n*n*n;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(print(5));
        


    }
}