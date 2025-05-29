public class Q2807 {
    public static int GCD(int x, int y){
        if(x%y==0){
            return y;
        }
        return GCD(y,x%y);
    }

    public static void main(String[] args) {
        System.out.println(GCD(4,4));
    }
}
