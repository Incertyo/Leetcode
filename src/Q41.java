public class Q41 {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<=0||nums[i]>= n+1){
                nums[i]=n+1;
            }
        }
        for(int i=0;i<n;i++){
            int ele=Math.abs(nums[i]);
            if(ele==n+1){
                continue;
            }
            int seat= ele-1;
            if(nums[seat]>0){
                nums[seat]=-nums[seat];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}
