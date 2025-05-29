import java.util.Arrays;

public class Q73 {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    int top=i;
                    int left=j;
                    int bottom=i;
                    int right=j;
                    while(top>0&&left>0&&bottom<n&&right<m) {
                       matrix[--top][left]=-(top+left);
                       matrix[++bottom][left]=-(bottom+left);
                       matrix[++top][--left]=-(top+left++);
                       matrix[--bottom][++right]=-(bottom+right--);
                       top--;left--;
                       right++;bottom++;
                    }
                    while(top>0){
                        matrix[--top][--left]=-(top+left);
                    }
                }
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j]==-(i+j)) {
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
