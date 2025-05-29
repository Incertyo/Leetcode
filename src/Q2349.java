import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class Q2349 {
    class  NumberContainers {
        HashMap<Integer, TreeSet<Integer>> numtoIdx;
        HashMap<Integer,Integer> idxtonum;
        public NumberContainers() {
            idxtonum=new HashMap<>();
            numtoIdx=new HashMap<>();
        }

        public void change(int index, int number) {
            if(idxtonum.containsKey(index)){
                int prev =idxtonum.get(index);
                numtoIdx.get(prev).remove(index);
                if(numtoIdx.get(prev).isEmpty()){
                    numtoIdx.remove(prev);
                }
            }
            idxtonum.put(index,number);
            if(!numtoIdx.containsKey(number)){
                numtoIdx.put(number,new TreeSet<>());
            }
            numtoIdx.get(number).add(index);
        }

        public int find(int number) {
            if(!numtoIdx.containsKey(number)){
                return-1;
            }
            return numtoIdx.get(number).first();
        }
    }
}
