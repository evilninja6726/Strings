package stringDs;

import java.util.Arrays;

public class AnagramSearch {
    static final int x=256;
    public static void main(String[] args) {
        System.out.println(anagramSearch("geeksforgeeks","frog"));
        System.out.println(anagramSearchEff("geeksforgeeks","frog"));
    }
    public static boolean anagram(String s1, String s2, int index){
        int[] arr=new int[x];
        Arrays.fill(arr,0);
        for (int i=0;i<s2.length();i++){
            arr[s1.charAt(i+index)-'a']++;
            arr[s2.charAt(i)-'a']--;
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0)
                return false;
        }
        return true;
    }
    public static boolean anagramSearch(String t, String p){
        int n=t.length();
        int m=p.length();
        for (int i=0;i<n-m+1;i++){
            if (anagram(t,p,i))
                return true;
        }
        return false;
    }
    public static boolean areSame(int[] t,int[] p){
        for (int i=0;i<x;i++){
            if (t[i]!=p[i])
                return false;
        }
        return true;
    }
    public static boolean anagramSearchEff(String t, String p){
        int[] arrT=new int[x];
        int[] arrP=new int[x];
        for (int i=0;i<p.length();i++){
            arrT[t.charAt(i)]++;
            arrP[p.charAt(i)]++;
        }
        for (int i=p.length();i<t.length();i++){
            if (areSame(arrT,arrP))
                return true;
            arrT[t.charAt(i)]++;
            arrT[t.charAt(i-p.length())]--;
        }
        return false;
    }
}
