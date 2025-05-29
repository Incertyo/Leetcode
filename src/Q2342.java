public class Q2342 {
    public static int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n = n / 10;
        }
        return sum;
    }
    public static int maximumSum(int[] nums) {
        int [] arr=new int[82];
        int maxSum=-1;
        for(int i=0;i<nums.length;i++){
            int curr= nums[i];
            if(arr[digitSum(curr)]!=0){
                int prev=arr[digitSum(curr)];
                maxSum=Math.max(maxSum,prev+curr);
                arr[digitSum(curr)]=Math.max(prev,curr);
            }
            else{
                arr[digitSum(curr)]=curr;
            }
        }
        return maxSum;

    }
    public static void main(String[] args) {
        int[] nums= {10,12,19,14};
        System.out.println(maximumSum(nums));
    }
}
