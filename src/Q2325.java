import java.util.HashMap;

public class Q2325 {
    public static String decodeMessage(String key, String message) {
        key = key.trim();
        message = message.trim();
        HashMap<Character, Character> map = new HashMap<>();
        int i=0;
        for (char c : key.toCharArray()) {
            if(!map.containsKey(c)&&c!=' '){
                map.put(c,(char)(i+'a'));
                i++;
            }
            if(i>26){break;}
        }
        String s="";
        for(char c : message.toCharArray()){
            if(map.containsKey(Character.toLowerCase(c))){
                s+=map.get(Character.toLowerCase(c));
            }
            if(c==' '){
                s+=c;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }
}
