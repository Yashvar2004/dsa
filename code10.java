public class code10 {
    public static void main(String[] args) {
        int[] arr = {3,1,4,1,5,9};
        int[][] queries = {{1,3},{0,2},{2,5}};
        int[] results = rangeSumQuery(arr, queries);
        for (int result : results) {
            System.out.println(result);
        }
        
    }
   public static int[]
    
     rangeSumQuery(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            if (left >0){
                result[i] = prefixSum[right] - prefixSum[left - 1];
            } else {
                result[i] = prefixSum[right];
            }
        }
        return result;
    }
}
