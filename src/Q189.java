public class Q189 {
    public static void rotate(int[] nums, int k) {
        int j = nums.length - k;
        for (int i = 0; i < nums.length && j < nums.length; i++) {
            long temp = nums[i];
            nums[i] = nums[j];
            for (int m = j; m > i; m--) {
                nums[m - 1] = nums[m];
                j++;
            }
            for (int e : nums) {
                System.out.println(e + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
 rotate(arr,3);
    }
}
