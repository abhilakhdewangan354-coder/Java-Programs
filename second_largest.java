import java.util.ArrayList;
import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer>arr = new ArrayList<>();

        for(int i = 0;i<n;i++) {
            int x = sc.nextInt();
            arr.add(x);
        }
        System.out.println(arr);
        
        int max = arr.get(0);

        for(int i = 1;i<arr.size();i++) {
            if(arr.get(i)>max) {
              max = arr.get(i);
 }
            }

            arr.remove(Integer.valueOf(max));

        int secondmax = arr.get(0);

        for(int i = 1;i<arr.size();i++) {
            if(arr.get(i)>secondmax) {
                secondmax = arr.get(i);
            }
          
        }
          System.out.println(secondmax);

            
    }
}