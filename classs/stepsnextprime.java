import java.util.Scanner;
public class stepsnextprime {

    static int isprime(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        boolean flag = false;
        if(count==2){
            flag = true;
        }
        if(flag==true){
            return n;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int m = n;
        n++;
        while(true){
            if(isprime(n)!=0){
                System.out.println(n-m);
                break;
            }
            n++;
        }
        

    }
}
