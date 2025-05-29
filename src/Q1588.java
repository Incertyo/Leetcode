public class Q1588 {
    public static int sumOddLengthSubarrays(int[] arr) {
        int g_sum = 0;
        for (int k = 1; k <= arr.length; k += 2) {
            for (int i = 0; i + k <= arr.length; i++) {
                int sum = 0;
                for (int j = i; j < i + k; j++) {
                    sum += arr[j];
                }
                g_sum += sum;
            }
        }
        return g_sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3}));
    }
}
