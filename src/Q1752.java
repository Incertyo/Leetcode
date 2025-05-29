public class Q1752 {
//    public static boolean check(int[] nums) {
//        int idx=0,n=nums.length;
//        for(int i=0;i<n-1;i++){
//            if(nums[i]>nums[i+1]){
//                idx=i+1;
//                break;
//            }
//        }
//        System.out.println(idx);
//        for(int i=0;i<n-1;i++){
//            if(nums[(i+idx)%n]>nums[(i+1+idx)%n]){
//                    return false;
//            }
//        }
//        return true;
//    }
public static boolean check(int[] nums) {
    int c=0,n=nums.length;
    for(int i=0;i<n;i++){
        if(nums[i]>nums[(i+1)%n]){
            c++;
        }
        if(c>1){
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        int[] nums= {1,2,3};
        System.out.println(check(nums));
    }
}
