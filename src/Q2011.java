public class Q2011 {
    public static  int finalValueAfterOperations(String[] operations) {
        int c=0;
        for(String s:operations){
            if(s.charAt(0)=='+'||s.charAt(2)=='+'){
                c++;
            }
            if (s.charAt(0)=='-'||s.charAt(2)=='-') {
                c--;
            }
        }
        return c;
    }

    public static void main(String[] args) {

    }
}
