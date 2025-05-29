public class Q643 {
    public static double findMaxAverage(int[] nums, int k) {
       double l_max=0;
       int i=0;
       int n = nums.length;
       while(i<k&&i<n){
           l_max+=nums[i++];
       }
       double g_max=l_max/k;
       for(i=1;i<=n-k;i++){
           l_max=l_max-nums[i-1]+nums[i+k-1];
           g_max=Math.max(l_max/k,g_max);
       }
       return g_max;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{0, 1,
        2,3,4},4));
    }
}
