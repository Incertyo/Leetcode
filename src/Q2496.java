public class Q2496 {
    public int maximumValue(String[] strs) {
        int val=0,max=Integer.MIN_VALUE;
        for(String s: strs ){
            for(char c: s.toCharArray()){
                if(c>=48&&c<=57) {
                    val = s.length();
                    break;
                }
            }

            max=Math.max(max,val);

        }
    }
}
