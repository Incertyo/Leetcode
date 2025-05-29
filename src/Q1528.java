import java.util.HashMap;
import java.util.HashSet;

public class Q1528 {
//    public static String restoreString(String s, int[] indices) {
//        HashMap<Integer,Character> map= new HashMap<>();
//        for(int i=0;i<s.length();i++){
//            map.put(indices[i],s.charAt(i));
//        }
//        String ans="";
//        for(int i=0;i<s.length();i++){
//            ans+=map.get(i);
//        }
//        return ans;
//    }
    public static String restoreString(String s, int[] indices) {
        char c[]= new char[s.length()];
        for(int i =0;i<s.length();i++){
            c[indices[i]]= s.charAt(i);
        }
        return String.valueOf(c);
    }

    public static void main(String[] args) {
        System.out.println(restoreString("codeleet",new int[]{4,5,6,7,0,2,1,3}));
    }
}
