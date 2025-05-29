import java.util.*;
public class Q989 {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        String sum="";
        List<Integer>ans= new ArrayList<>();
        for(int i =0;i<num.length;i++){
            sum=sum+num[i];
            if(i== num.length-1){
                int val=Integer.parseInt(sum);
                val+=k;
                sum=""+val;
                System.out.println(sum);
                int c=0;
                while(sum.length()>0){
                    ans.add(Integer.parseInt(""+sum.charAt(0)));

                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{1,2,0,0},34));
    }
}
