public class Q2914 {
    public static int minChanges(String s) {
        int count=0;
        for(int i=0;i<s.length();i+=2){
            if(s.charAt(i)!=s.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(minChanges("1001"));
        System.out.println(minChanges("10"));
        System.out.println(minChanges("0000"));
    }

}
