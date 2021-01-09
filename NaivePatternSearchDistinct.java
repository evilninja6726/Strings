package stringDs;

public class NaivePatternSearchDistinct {
    public static void main(String[] args) {
        naivePatternSearchDistinct("abcabcd","abcd");
    }

    public static void naivePatternSearchDistinct(String text, String pattern){
        for (int i=0;i<text.length()-pattern.length()+1;){
            int j;
            for (j=0;j<pattern.length();j++){
                if (pattern.charAt(j)!=text.charAt(i+j))
                    break;
            }
            if (pattern.length()==j)
                System.out.print(i+" ");
            if (j!=0)
                i+=j;
            else
                i++;
        }
    }
}
