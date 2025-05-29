public class Q26 {
    public static int removeDuplicates(int[] a) {
        int n = a.length - 1;
        int i = 0;
        for (int j = 1; j <= n; j++) {
            if (a[j] != a[i]) {
                a[i + 1] = a[j];
                i++;
            }
        }

        return (i + 1);
    }
}
