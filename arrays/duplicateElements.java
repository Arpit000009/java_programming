package arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class duplicateElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : mpp.entrySet() ){
            if(entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}

