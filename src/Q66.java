import java.util.Arrays;

public class Q66 {
    public static int[] plusOne(int[] digits) {
        int num=0;
        for(int i=0;i<digits.length;i++){
            num=num*10+digits[i];
        }
        num++;
        int res[]= new int[(""+num).length()];
        for(int i=res.length-1;i>=0;i--){
            res[i]=num%10;
            num=num/10;
        }
        if(num==9){
            res[0]=1;
            return res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9})));
    }
}
