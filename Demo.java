package stringDs;

public class Demo {
    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pattern = "eks";
        rabinKarp(pattern, txt);
    }

    public static void rabinKarp(String pattern, String txt) {
        int m = pattern.length();
        int n = txt.length();
//        int i, j;
        int q=101;
        int d=256;
        int p = 0;
        int t = 0;
        int h = 1;

        for (int i = 0; i < m - 1; i++)
            h = (h * d) % q;

        // Calculate hash value for pattern and text
        for (int i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        // Find the match
        for (int i = 0; i < n - m + 1; i++) {
            if (p == t) {
                int j;
                for (j = 0; j < m; j++) {
                    if (txt.charAt(i + j) != pattern.charAt(j))
                        break;
                }

                if (j == m)
                    System.out.println(i);
            }

            if (i < n - m) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
                if (t < 0)
                    t += q;
            }
        }
    }
}