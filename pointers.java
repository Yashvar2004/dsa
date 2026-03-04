import java.util.Scanner;
public class pointers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

            int[] arr = new int[num];

            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            int left=0;
            int right=num-1;
            boolean found = false;

            while (left<right) {
                int sum = arr[left]+arr[right];

                if (sum==target){
                    System.out.println("pair found: " + arr[left] + ", " + arr[right]);
                    found = true;
                    break;
                }
                else if (sum<target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

    
}
