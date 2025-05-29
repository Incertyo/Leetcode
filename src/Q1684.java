import java.util.*;

public class Q1684 {
    public static int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            set.add(words[i].charAt(0));
        }
        int count = 0;
        for (String str : words) {
            for (int i = 0; i < str.length(); i++) {
            if(!set.contains(str.charAt(i))){
                continue;
            }
            }
        }
        return count;

    }
}
