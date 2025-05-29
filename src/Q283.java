public class Q283 {
    public static void moveZeroes(int[] nums) {
        int z_c=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                for(int j=i+1;j<nums.length-z_c;j++){
                    nums[j-1]=nums[j];
                }
                nums[nums.length-1-z_c]=0;
            }
        }
        for(int e:nums){
            System.out.print(e+" ");
        }
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
        moveZeroes(new int[]{0});
    }
}
