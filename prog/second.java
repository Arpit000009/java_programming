package prog;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class second {
    static int secondLargest(int arr[]){
        
         Arrays.sort(arr);

         return arr[arr.length-2];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i = 0;
        while(n>0){
            arr[i] = sc.nextInt();
            i++;
            n--;
        }
        System.out.println("second largest:"+secondLargest(arr));
    }
}
