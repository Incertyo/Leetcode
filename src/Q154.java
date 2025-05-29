import java.util.Arrays;

public class Q154 {
    public static  int findMin(int[] nums) {
        int i=0;
        int j=nums.length-1;
        if(j==0){
            return nums[0];
        }
        while(i<j){
            int mid= i+(j-i)/2;
            if(nums[mid]<nums[j]){
                j=mid;
            }
            else if(nums[mid]>nums[j]){
                i=mid+1;
            }
            else {
                j--;
            }
        }
        return nums[i];

    }
    public static void main(String[] args) {
        int [] nums= {2,1,2,2,2};
        System.out.println(findMin(nums));
    }
}
