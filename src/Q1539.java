public class Q1539 {
    public static int findKthPositive(int[] arr, int k) {
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            int diff= arr[mid]-(mid+1);
            if(diff<k){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return i+k;
    }

    public static void main(String[] args) {
        int[] arr = {2};
        System.out.println(findKthPositive(arr, 1));

    }
}
