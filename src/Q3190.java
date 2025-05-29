public class Q3190 {
    public static int minimumOperations(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int [] nums= {3,6,9};
        System.out.println(minimumOperations(nums));
    }
}
