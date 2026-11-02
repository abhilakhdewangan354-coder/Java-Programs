public class rec7 {

    public static int fibo(int n) {

        if(n == 0) {
            return 0;
        }
        else if(n == 1 || n == 2) {
            return 1;
        }
        else {
            return fibo(n-1) + fibo(n-2);
        }
    }

    public static void main(String[] args) {

        int n = 3;

        for(int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
