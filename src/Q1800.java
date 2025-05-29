public class Q1800 {
    public static  int maxAscendingSum(int[] nums) {
        int sum=nums[0],maxS=nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                sum+=nums[i+1];
            }
            else{
                sum=nums[i+1];
            }
            maxS=Math.max(maxS,sum);
        }
        return maxS;
    }
    public static void main(String[] args) {
        int[] nums= {12,17,15,13,10,11,12};
        System.out.println(maxAscendingSum(nums));
    }
}
