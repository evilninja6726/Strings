package stringDs;

public class NaivePatternSearch {
    public static void main(String[] args) {
        naivePatternSearchUsingSubstring("abababcd","abab");
        System.out.println();
        naivePatternSearch("abababcd","abab");
    }

    public static void naivePatternSearch(String text, String pattern){
        for (int i=0;i<text.length()-pattern.length()+1;i++){
            int j;
            for (j=0;j<pattern.length();j++){
                if (text.charAt(i+j)!=pattern.charAt(j))
                    break;
            }
            if (j==pattern.length())
                System.out.print(i+" ");
        }
    }
    public static void naivePatternSearchUsingSubstring(String text, String pattern){
        for (int i=0;i<text.length()-pattern.length()+1;i++){
            if (text.substring(i,pattern.length()+i).equals(pattern)){
                System.out.print(i+ " ");
            }
        }
    }
}
