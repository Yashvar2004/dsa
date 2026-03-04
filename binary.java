public class binary {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int target = 3;
        int left = 0;
        int right = arr.length - 1;

        while (left <=right) {
            int mid = left + (right-left)/2;
            if (arr[mid]==target) {
                System.out.println("element found at index: " + mid);
                return;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
    
}
