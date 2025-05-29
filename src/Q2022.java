import java.util.Arrays;

public class Q2022 {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][]arr=new int[m][n];
        int idx=0;
        if(m*n<original.length){
            int[][] ints = new int[0][0];
            return ints;
        }
        for(int i=0;i<m&&idx< original.length;i++){
            for(int j=0;j<n&&idx< original.length;j++){
                arr[i][j]=original[idx];
                idx++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1,2},1,1)));
    }
}
