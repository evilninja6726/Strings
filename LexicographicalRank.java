package stringDs;

public class LexicographicalRank {
    static final int x = 256;

    public static void main(String[] args) {
        System.out.println(lexicographicalRank("string"));
        System.out.println(factorial(5));
    }

    public static int lexicographicalRank(String s) {
        int rank = 0;
        int arr[] = new int[x];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        for (int i = 0; i < s.length() - 1; i++) {
            rank += (arr[s.charAt(i) - 1]) * factorial(s.length() - i - 1);
            for (int j = s.charAt(i); j < arr.length; j++) {
                arr[j]--;
            }
        }
        return rank + 1;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
