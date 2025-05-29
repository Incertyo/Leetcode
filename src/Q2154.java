import java.util.HashSet;

public class Q2154 {

    public static int findFinalValue(int[] nums, int original) {
        HashSet<Integer>set= new HashSet<>();
        for(int e:nums){
            if(e==original){
                for(int m:nums){
                    set.add(m);
                }
            }
        }
        while(set.contains(original)){
            original*=2;
        }
        return original;
    }
    public static void main(String[] args) {
        System.out.println(findFinalValue(new int[]{2,7,9}, 4));
    }
}
