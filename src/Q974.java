public class Q974 {
    public static int subarraysDivByK(int[] nums, int k) {
        int[] map= new int[k];
        map[0]++;
        int sum=0,res=0;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
            int mod=sum%k;
            if(mod<0){
                mod=mod+k;
            }
            res+=map[mod];
            map[mod]++;
        }
        return res;
    }
}
