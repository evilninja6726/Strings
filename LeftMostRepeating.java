package stringDs;

import java.util.Arrays;

public class LeftMostRepeating {
    public static void main(String[] args) {
        System.out.println(leftMostRepeating("rajat"));
        System.out.println(leftMostRepeatingEff("international"));
        System.out.println(leftMostRepeatingMoreEff("international"));
        System.out.println(leftMostRepeatingMoreEff("rajat"));
        System.out.println(leftMostRepeatingMostEff("rajat"));
        System.out.println(leftMostRepeatingMostEff("international"));
    }

    public static int leftMostRepeating(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(i))
                    return i;
            }
        }
        return -1;
    }

    public static int leftMostRepeatingEff(String s) {
        int[] arr = new int[256];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] > 1)
                return i;
        }
        return -1;
    }

    public static int leftMostRepeatingMoreEff(String s) {
        int[] arr = new int[256];
        Arrays.fill(arr, -1);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == -1)
                arr[s.charAt(i) - 'a'] = i;
            else
                res = Math.min(res, arr[s.charAt(i) - 'a']);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public static int leftMostRepeatingMostEff(String s){
        boolean []arr=new boolean[256];
        Arrays.fill(arr,false);
        int res=-1;
        for (int i=s.length()-1;i>=0;i--){
            if (!arr[s.charAt(i)-'a'])
                arr[s.charAt(i)-'a']=true;
            else
                res=i;
        }
        return res;
    }
}
