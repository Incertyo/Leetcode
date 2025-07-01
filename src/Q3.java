public class Q3 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int[] map = new int[128];
            for (int i = 0; i < 128; i++) map[i] = -1;
            int l = 0, r = 0, n = s.length(), max_len = 0;
            if (n == 0) return 0;
            while (r < n) {
                char ch = s.charAt(r);
                int c = map[ch];
                if (c != -1 && c >= l) {
                    l = c + 1;
                }
                int len = r - l + 1;
                max_len = Math.max(max_len, len);
                map[ch] = r;
                r++;
            }
            return max_len;
        }
    }
}
