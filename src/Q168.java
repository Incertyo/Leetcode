public class Q168 {
            public static String convertToTitle(int columnNumber) {
                String s = "";
                while (columnNumber >= 1) {
                    if (columnNumber % 26 == 0) {
                        s = 'Z' + s;
                        columnNumber = (columnNumber - 1) / 26;
                    } else {
                        s = (char) (64 + columnNumber % 26) + s;
                        columnNumber /= 26;
                    }
                }
                return s;
            }
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
}
