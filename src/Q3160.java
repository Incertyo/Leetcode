import java.util.Arrays;
import java.util.HashMap;

public class Q3160 {
    public static int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> balls = new HashMap<>();
        HashMap<Integer ,Integer> colors = new HashMap<>();
        int n = queries.length;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            int ball = queries[i][0];
            int color = queries[i][1];

            if(balls.containsKey(ball)){
                int oldColor = balls.get(ball);
                int count = colors.getOrDefault(oldColor, 0) - 1;
                if(count == 0){
                    colors.remove(oldColor);
                }
                else{
                    colors.put(oldColor, count);
                }
            }

            balls.put(ball, color);
            colors.put(color, colors.getOrDefault(color, 0) + 1);
            ans[i] = colors.size();
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(queryResults(4, new int[][]{{1, 4}, {2, 5}, {1, 3}, {3, 4}})));
    }
}
