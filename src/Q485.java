public class Q485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,g_max=0;
        for(int e:nums){
            c=(e==1)?c+1:0;
            g_max=Math.max(c,g_max);
        }
        return g_max;
    }
}
