import java.util.PriorityQueue;

public class Q2545 {
    public static int[][] sortTheStudents(int[][] score, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] map= new int[score[k].length];
        for(int i=0;i<score[k].length;i++){
            map[i]=score[k][i];
            pq.add(score[k][i]);
        }
        for(int i=0;i<score[k].length;i++){
            int min=pq.poll();
            int idx= search(map,min);
            int [] temp=score[i];
            score[i]=score[idx];
            score[idx]=temp;
            int t= map[i];
            map[i]=map[idx];
            map[idx]=t;
        }
        return score;
    }
    public static int search(int[] map,int tar) {
        for(int e:map){
            if(e==tar)
                return e;
        }
        return -1;
    }
}
