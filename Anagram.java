package stringDs;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("baab","abba"));
        System.out.println(anagramEff("baab","abba"));
    }
    public static boolean anagram(String s1, String s2){
        if (s1.length()!=s2.length())
            return false;
        char[] char1 =s1.toCharArray();
        Arrays.sort(char1);
        s1=new String(char1);
        char[] char2=s2.toCharArray();
        Arrays.sort(char2);
        s2=new String(char2);
        return s1.equals(s2);
    }

    public static boolean anagramEff(String s1, String s2){
        int []arr=new int[26];
        for (int i=0;i<arr.length;i++){
            arr[i]=0;
        }
        for (int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0)
                return false;
        }
        return true;
    }
}
