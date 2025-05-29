public class Q190 {
    public int reverseBits(int n) {
        String s = ""+n;
        long val=0,mul=1;
        while(s.length()>0){
            val=val+mul*Integer.valueOf(""+s.charAt(0));
            s=s.substring(1,s.length());
            mul*=2;
        }
        return (int)val;
    }
    public static void main(String[] args) {
        Q190 c = new Q190();



    }
}
