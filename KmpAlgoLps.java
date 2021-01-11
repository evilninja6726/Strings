package stringDs;

import java.util.Arrays;

public class KmpAlgoLps {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(kmpAlgoLps("ababacab")));
    }

    public static int[] kmpAlgoLps(String s){
        int j=0;
        int []lps=new int[s.length()];
        lps[0]=0;
        int i=1;
        while (i<s.length()){
            if (s.charAt(i)==s.charAt(j)){
                lps[i]=j+1;
                i++; j++;
            }else {
                if (j==0){
                    lps[i]=0;
                    i++;
                }else {
                    j=lps[j-1];
                }
            }
        }
        return lps;
    }
}
