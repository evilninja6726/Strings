package stringDs;

public class KmpAlgo {
    public static void main(String[] args) {
        kmpAlgo("ababcababaad","ababa");
    }

    public static int[] lps(String s){
        int []lps=new int[s.length()];
        int i=1;
        int j=0;
        lps[0]=0;
        while (i<s.length()){
            if (s.charAt(i)==s.charAt(j)){
                lps[i]=j+1;
                i++; j++;
            }
            else {
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

    public static void kmpAlgo(String t, String p){
        int j=0;
        int i=0;
        while (i<t.length()){
            if (t.charAt(i)==p.charAt(j)){
                 i++; j++;
            }else {
               if (j!=0){
                   j=lps(p)[j-1];
               }else {
                   i++;
               }
            }
            if (j==p.length()) {
                System.out.println(i - j);
                j=lps(p)[j-1];
            }
        }
    }
}
