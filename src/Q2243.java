public class Q2243 {
    public static String digitSum(String s, int k) {
        if(s.length() <= k) {
            return s;
        }
        int ans = 0;
        String a = "";
        for (int i = 0; i < s.length(); i += k) {
            ans = 0;
            for (int j = i; j < i + k && j < s.length(); j++) {
                ans += Integer.parseInt("" + s.charAt(j));
            }
            a+=ans;
        }
        return digitSum(a,k);
    }

    public static void main(String[] args) {
        System.out.println(digitSum("11111222223",3));
    }
}
