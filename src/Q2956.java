import java.util.HashSet;

public class Q2956 {
    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int []ans= new int[2];
        HashSet<Integer>map1= new HashSet<>();
        HashSet<Integer>map2= new HashSet<>();
        for(int e:nums1)  map1.add(e);
        for(int e:nums2)  map2.add(e);
        for(int e:nums1){
            if(map2.contains(e)){
                ans[0]++;
            }
        }
        for(int e:nums2){
            if(map1.contains(e)){
                ans[1]++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]a={3,4,2,3};
        int[]b={1,5};

        for(int e:findIntersectionValues(a,b)){
            System.out.print(e+" ");
        }
    }
}
