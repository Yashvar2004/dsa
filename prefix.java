import java.util.*;

public class prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Prefix sum logic
        for(int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i-1];
        }

        System.out.println("Prefix sums:");
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
