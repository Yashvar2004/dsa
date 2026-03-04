
import java.util.Scanner;

public class code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements:");
        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
