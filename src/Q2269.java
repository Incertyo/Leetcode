public class Q2269 {
    public int divisorSubstrings(int num, int k) {
        String s = ""+num;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=Integer.parseInt(""+s.charAt(i));
        }
        int c=0;
        for(int i=k;i<s.length()-k;i++){
            if(num%sum==0)c++;
            sum=sum-Integer.parseInt(""+s.charAt(i))+Integer.parseInt(""+s.charAt(i+k));
        }
        return c;
    }
}
