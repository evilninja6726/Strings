package stringDs;

import java.util.Arrays;

public class LongestDistinctSubString {
    static final int x=256;
    public static void main(String[] args) {
        System.out.println(LongestDistinctSubString("geeksforgeeks"));
        System.out.println(LongestDistinctSubStringMoreEff("geeksforgeeks"));
        System.out.println(LongestDistinctSubStringMostEff("abac"));
        System.out.println(LongestDistinctSubStringMostEff("geeksforgeeks"));
        System.out.println(LongestDistinctSubStringMoreEff("abac"));
    }

    public static boolean isDistinct(String s, int i, int j){
        boolean[] isVisited=new boolean[x];
        for (int z=i;z<=j;z++){
            if (isVisited[s.charAt(z)])
                return false;
            isVisited[s.charAt(z)]=true;
        }
        return true;
    }

    public static int LongestDistinctSubString(String s){
        int len=0;
        for (int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                if (isDistinct(s,i,j))
                    len=Math.max(len,j-i+1);
            }
        }
        return len;
    }

    public static int LongestDistinctSubStringMoreEff(String s){
        int len=0;
        for (int i=0;i<s.length();i++){
            boolean[] isVisited=new boolean[x];
            for (int j=i;j<s.length();j++) {
                if (isVisited[s.charAt(j)])
                    break;
                else {
                    len=Math.max(len,j-i+1);
                    isVisited[s.charAt(j)]=true;
                }
            }
        }
        return len;
    }

    public static int LongestDistinctSubStringMostEff(String s){
         int i=0; int len=0;
        int[] lastIndex=new int[x];
        Arrays.fill(lastIndex,-1);
         for (int j=0;j<s.length();j++){
             i=Math.max(i,lastIndex[s.charAt(j)]+1);
             len=Math.max(len,j-i+1);
             lastIndex[s.charAt(j)]=j;
         }
         return len;
    }
}
