import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Q2231 {
    public static int largestInteger(int num) {
        String s = ""+num;
        ArrayList<Integer> check = new ArrayList<>(s.length());
        PriorityQueue<Integer>even = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer>odd = new PriorityQueue<>(Collections.reverseOrder());
        int ans=0;
        while(num!=0){
            int temp=num%10;
            if(temp%2==0){
                even.add(temp);
                check.add(0);
            }
            else {
                odd.add(temp);
                check.add(1);
            }
            num/=10;
        }
        for(int i =s.length()-1;i>=0;i--){
            if (check.get(i) ==1&&!odd.isEmpty()) {
                ans=ans*10+ odd.poll();
            } else if(check.get(i)==0&&!even.isEmpty()){
                ans=ans*10+even.poll();
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(largestInteger(65875));
    }
}
