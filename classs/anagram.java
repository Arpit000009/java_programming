import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if(isanagram(str1,str2)){
            System.out.println("strings are anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }

    public static boolean isanagram(String str1,String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(arr1==arr2){
            return true;
        }
        return false;
    }
}
