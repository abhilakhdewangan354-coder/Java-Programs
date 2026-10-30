import java.util.Scanner;

public class rec4 {

    public static int print(int base, int power) {
        if(power == 0) {
            return 1;
        }
        else {
            return base * print(base, power-1);
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int power = sc.nextInt();

        System.out.print(print(base, power));

    }
}
