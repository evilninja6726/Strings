package stringDs;

public class Rotations {
    public static void main(String[] args) {
        System.out.println(rotations("abcd","cdab"));
        System.out.println(rotations2("abdd","cdab"));

    }
    public static boolean rotations(String s1, String s2){
        int i=1; int j=1;
        while (j<=s2.length()){
            if (s2.charAt(j-1)==s1.charAt((i-1)%s1.length())){
                i++; j++;
            }else {
                j=1;
                i++;
            }
            if (j>s2.length())
                return true;
        }
        return false;
    }

    public static boolean rotations2(String s1, String s2){
        if (s1.length()!=s2.length())
            return false;
        else
            return (s1+s1).indexOf(s2)>=0;
    }
}
