import java.util.Scanner;

public class previousprime {
   public static boolean isprime(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        n = n-1;
        while(n>0){
            if(isprime(n)){
                System.out.println(m-n);
                break;
            }
            n--;
        }
        
    }
}
