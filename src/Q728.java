import java.util.ArrayList;
import java.util.List;

public class Q728 {
    public static boolean isSelf(int num, int org) {
        if(num==0){
            return true;
        }
        int d=num%10;
        if(d==0||org%d!=0){
            return false;
        }
        return isSelf(num/10,org);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelf(i, i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
    }
}
