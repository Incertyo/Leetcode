public class Q201 {
    public static int rangeBitwiseAnd(int left, int right) {
        int c=0;
        while(left!=right){

            left=left>>1;
                right=right>>1;
            c++;
        }
        while(c!=0){
           left= left<<1;
            c--;
        }
        return left;
    }
    public static int rangeBitwiseAnd_v2(int left, int right) {
        while(left<right){
            right=right&(right-1);
        }
        return left&right;
    }

    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(1,2147483647));
        System.out.println(rangeBitwiseAnd_v2(1,2147483647));
    }
}
