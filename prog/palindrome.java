package prog;
import java.util.Scanner;

public class palindrome {
    static boolean ispalindrome(String str){
        char arr[] = str.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            } else {
                i++;
                j--;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(ispalindrome(str)==true){
            System.out.println("palindrome string");
        }
        else{
            System.out.println("not palindrome");
        }
        sc.close();
    }
}


// find factorial using recursion 
