import java.util.Scanner;
public class occurences {
    static int occurancetimes(int arr[],int n){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i = 0;
        while(n>0){
            arr[i] = sc.nextInt();
            n--;
            i++;
        }
        System.out.println("enter the element to find");
        int element = sc.nextInt();
        System.out.println((occurancetimes(arr,element)));
    }
}
