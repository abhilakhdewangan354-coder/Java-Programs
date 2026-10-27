public class stack_using_array {
    public static void main(String[] args) {

        int[] stack = new int[5];

        int top = -1;

        top++;
        stack[top] = 10;

        top++;
        stack[top] = 20;

        top++;
        stack[top] = 30;

        System.out.print("Stack : " + stack[top]);
    }
}