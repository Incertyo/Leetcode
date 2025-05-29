import java.util.HashMap;

public class Q205 {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return false;
                }
            } else {
                if (map.containsValue(c2)) {
                    return false; // c2 is already mapped to another character
                }
                map.put(c1, c2);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba")); // Output should be false
        System.out.println(isIsomorphic("egg", "add")); // Output should be true
        System.out.println(isIsomorphic("foo", "bar")); // Output should be false
        System.out.println(isIsomorphic("paper", "title")); // Output should be true
    }
}
