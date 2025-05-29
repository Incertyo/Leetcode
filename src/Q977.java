public class Q977 {
    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int j = nums.length - 1;
        while (left <= right) {
            int lsq = nums[left] * nums[left];
            int rsq = nums[right] * nums[right];
            if (rsq > lsq) {
                res[j] = rsq;
                right--;
            } else {
                res[j] = lsq;
                left++;
            }
            j--;
        }
        return res;
    }

    public static void main(String[] args) {
        
    }
}
