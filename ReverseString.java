package stringDs;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("we are fine and happy"));
    }
    public static String reverseString(String s){
        char[] arr;
        arr=s.toCharArray();
        int i=0;
        for (int j=0;j<arr.length;j++){
            if (arr[j]==' '){
                reverse(arr,i,j-1);
                i=j+1;
            }
        }
        reverse(arr,i,arr.length-1);
        reverse(arr,0,arr.length-1);
        return new String(arr);
    }
    public static void reverse(char[] arr,int start, int end){
        while (start<end){
            char temp;
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++; end--;
        }
    }
}
