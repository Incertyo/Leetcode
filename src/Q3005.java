public class Q3005 {
    public int maxFrequencyElements(int[] nums) {
        int[] freq= new int[100];
        int max_f=0;
        for(int e:nums){
            freq[e-1]++;
            max_f=Math.max(max_f,freq[e-1]);
        }
        int sum=0;
        for(int e:freq){
            if(e==max_f){
                sum+=e;
            }
        }
        return sum;

    }
}
