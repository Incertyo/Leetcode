import java.util.HashMap;

public class practice {
    public static boolean check(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        //S is String name
        map.put('N',10);
        map.put('S',-10);
        map.put('W',-1);
        map.put('E',1);
        int sum=0;
        for(int i =0;i<s.length();i++){
            sum+=map.get(s.charAt(i));
        }
        return sum==0;
    }
    public static void main(String[] args) {
        System.out.println(check("NNSS"));
    }
}
