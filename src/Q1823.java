public class Q1823 {
    public static int subsetXORSum(int[] nums) {
        return findXortotal(nums,0,0);
    }
    public static  int findXortotal(int[]nums,int idx,int xor){
        if(idx==nums.length)return xor;
        int pick=findXortotal(nums,idx+1,xor^nums[idx]);
        int nopick=findXortotal(nums,idx+1,xor);
        return pick+nopick;
    }

    public static void main(String[] args) {

    }
}
