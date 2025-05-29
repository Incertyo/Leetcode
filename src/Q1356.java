import java.util.Arrays;

public class Q1356 {
    public static int parity(int n){
        int c=0;
        while(n>0){
            c+=n&1;
            n>>=1;
        }
        return c;
    }
    public static int[] sortByBits(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(parity(arr[i])>parity(arr[j])){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                if(parity(arr[i])==parity(arr[j])&&(arr[i]>arr[j])){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByBits(new int[]{0,1,2,3,4,5,6,7,8})));
    }
}
