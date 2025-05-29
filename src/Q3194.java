import java.util.Arrays;

public class Q3194 {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        double d=100.02;
        for(int i=0;i<=n/2;i++){
            d=Math.min(d,(nums[i]+nums[(n-i-1)])/2.0);
        }
        return d;
    }
}
