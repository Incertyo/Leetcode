public class Q560 {
    public static int subarraySum(int[] nums, int k) {
        int sum=0;
        int left=0;
        int right=0,c=0;
        int min_length= Integer.MAX_VALUE;
//        NOT COMPLETED
//        NOT COMPLETED
//        NOT COMPLETED
//        NOT COMPLETED
//        NOT COMPLETED
//        NOT COMPLETED
        for (left=0;left<nums.length;left++) {
            while (left < nums.length) {
                if (right < nums.length && sum <= k) {
                    sum += nums[right];
                    if(sum==k) c++;

                    right++;
                } else if (sum > k) {
                    min_length = Math.min(min_length, right - left);
                    sum -= nums[left];
                    left++;
                } else {
                    break;
                }
            }

        }
        return min_length==Integer.MAX_VALUE?0:c+1;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,1,1},2));
        System.out.println(subarraySum(new int[]{1,2,3},3));
        System.out.println(subarraySum(new int[]{1,2,1,2,1},3));
    }
}
