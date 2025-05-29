public class Q540 {
//    public static int singleNonDuplicate(int[] nums) {
//        int i=0;
//        int idx=-1;
//        int j=nums.length-1;
//        if(j==0){
//            return nums[0];
//        }
//        else {
//            while (i <= j) {
//                int mid = i + (j - i) / 2;
//                if (mid % 2 != 0) {
//                    if (nums[mid] == nums[mid - 1]){
//                        i = mid + 1;
//                    } else {
//                        idx = mid;
//                        j = mid - 1;
//                    }
//                } else {
//                    if (mid+1<nums.length&&nums[mid] == nums[mid + 1] ) {
//                        i = mid + 1;
//                    } else {
//                        idx = mid;
//                        j = mid - 1;
//                    }
//                }
//            }
//            return nums[idx];
//        }
//    }
public static int singleNonDuplicate(int[] nums) {
    int i =0;
    int j =nums.length-1;
    if(j==0){
        return nums[0];
    }
        while(i<j){
            int mid=i+(j-i)/2;
            if(mid%2==1){
                mid--;
            }
                if(nums[mid]==nums[mid+1]){
                    i=mid+2;
                }
                else{
                    j=mid;
                }

    }
    return nums[i];
}
    public static void main(String[] args) {
        int[] nums= {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }
}
