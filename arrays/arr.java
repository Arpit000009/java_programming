package arrays;

import java.util.Scanner;


public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i = 0 ;
        while(n>0){
            arr[i] = sc.nextInt();
            i++;
            n--;
        }

        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        sc.close();
    }
}
