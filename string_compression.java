import java.util.Scanner;

public class string_compression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User se string input
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        String result = "";

        int count = 1;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } 
            else {
                result += s.charAt(i - 1) + "" + count;
                count = 1;
            }
        }

       
        result += s.charAt(s.length() - 1) + "" + count;

        System.out.println("Result: " + result);
    }
}

