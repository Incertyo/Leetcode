import java.util.HashSet;

public class Q1346 {
    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer>map=new HashSet<>();
        int c=0;
        for(int e:arr){
            if(e==0){
                c++;
            }
            map.add(e);
        }
        for(int e:arr){
             if(c<2&&e==0){
                 return false;
             }
             else if(map.contains(e*2)){
                 return true;
             }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{10,2,5,3}));
        System.out.println(checkIfExist(new int[]{3,1,7,11}));
        System.out.println(checkIfExist(new int[]{-2,0,10,-19,4,6,-8}));
        System.out.println(checkIfExist(new int[]{0,0}));
    }
}
