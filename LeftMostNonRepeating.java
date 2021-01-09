package stringDs;

import java.util.Arrays;

public class LeftMostNonRepeating {
    public static void main(String[] args) {
        System.out.println(leftMostNonRepeating("abcdabc"));
        System.out.println(leftMostNonRepeatingEff("abcdabc"));
        System.out.println(leftMostNonRepeatingMoreEff("abcdabc"));
    }

    public static int leftMostNonRepeating(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return i;
        }
        return -1;
    }

    public static int leftMostNonRepeatingEff(String s) {
        int[] arr = new int[256];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }

    public static int leftMostNonRepeatingMoreEff(String s) {
        int[] arr = new int[256];
        Arrays.fill(arr, -1);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == -1)
                arr[s.charAt(i) - 'a'] = i;
            else
                arr[s.charAt(i) - 'a'] = -2;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0)
                res = Math.min(res, arr[i]);
        }
        return (res == Integer.MAX_VALUE ? -1 : res);
    }
}
