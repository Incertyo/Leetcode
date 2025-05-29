import java.util.HashSet;

public class Q500 {
    public String[] findWords(String[] words) {
        HashSet<Character> r1 = new HashSet<>();
        HashSet<Character> r2 = new HashSet<>();
        HashSet<Character> r3 = new HashSet<>();
        String s = "qwertyuiop$asdfghjkl$zxcvbnm";
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (s.charAt(i) == '$') {
                i++;
                j++;
            } else {
                if (j == 0) {
                    r1.add(s.charAt(i));
                } else if (j == 1) {
                    r2.add(s.charAt(i));
                } else {
                    r3.add(s.charAt(i));
                }
            }

        }
        for (int i = 0; i < words.length; i++) {
            boolean check = false;
            for (int j = 0; j < words[i].length(); j++) {
            }
        }
return new String[]{};
    }


    public static void main(String[] args) {

    }
}
