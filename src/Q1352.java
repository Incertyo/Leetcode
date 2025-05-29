import java.util.*;

public class Q1352 {
    List <Integer> list ;
    int idx;
    public void ProductOfNumbers() {
        list = new ArrayList<>();
        idx=0;
    }

    public void add(int num) {
        if(list.size()==0){
            list.add(num);
        }
        if(num==0&&list.size()-1>0){
            list.add(0);
            list.add(list.size()-2,0);

        }
    }

    public int getProduct(int k) {
        return 0;
    }
}
