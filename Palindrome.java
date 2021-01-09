package stringDs;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("abba"));
        System.out.println(palindromeEff("abba"));
    }
    public static boolean palindrome(String s){
        StringBuilder rev=new StringBuilder(s);
        rev.reverse();
        return s.equals(rev.toString());
    }

    public static boolean palindromeEff(String s){
        int i=0,j=s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
