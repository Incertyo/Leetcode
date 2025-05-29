import java.util.Arrays;
public class Q3011 {
    public static boolean canSortArray(int[] nums) {
        int[]map=new int[9];
        int [] temp=Arrays.copyOf(nums,nums.length);
        for(int i=0;i<nums.length;i++){
            int count=0;
            while(nums[i]!=0){
                count+=nums[i]&1;
                nums[i]=nums[i]>>1;
            }
            map[count]++;
        }
        if(nums.length==1) return true;
        boolean b= true;
        for(int e:map){
            if(e==1){
                for(int i=0;i<temp.length-1;i++){
                    if(temp[i]>temp[i+1]) return false;
                }
                return true;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        int []nums={8,4,2,30,15};
        System.out.println(canSortArray(new int[]{2,17}));
        System.out.println(canSortArray(new int[]{8,4,2,30,15}));
        System.out.println(canSortArray(new int[]{3,16,8,4,2}));
        System.out.println(canSortArray(new int[]{3}));
    }
}
