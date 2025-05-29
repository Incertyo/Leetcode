public class Q2124 {
    public static boolean checkString(String s) {
       int idx_a=Integer.MIN_VALUE;
       int idx_b=Integer.MAX_VALUE;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='a'){
               idx_a=i;
           }
           if(s.charAt(s.length()-1-i)=='b'){
               idx_b=s.length()-1-i;
           }
       }
       return idx_a<idx_b;
    }
    public static void main(String[] args) {
        System.out.println(checkString("aabb"));
    }
}
