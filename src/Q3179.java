import java.util.Arrays;

public class Q3179 {
    public static int valueAfterKSeconds(int n, int k) {
        long []arr = new long[n];
        Arrays.fill(arr, 1);
        for(int i = 0; i < k; i++){
            long sum=0;
            for(int j = 0; j < n; j++){
                sum+=arr[j];
                arr[j] = sum%(1000000007);
            }
        }
        return (int)arr[n-1]%(1000000007);
    }
    public static void main(String[] args) {
        System.out.println(valueAfterKSeconds(5, 1000));
    }
}
