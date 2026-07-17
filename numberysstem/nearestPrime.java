package numberysstem;
import java.util.Scanner;

class nearestPrime {

   static boolean isPrime(int n){
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m  = n;
        int o = n;

        int lowNearestPrime;
        int highNearestPrime;

        while(true){
            if(isPrime(n)){
                highNearestPrime = n;
                break;
            }
            n++;
        }

        while(true){
            if(isPrime(m)){
                lowNearestPrime = m;
                break;
            }
            m--;
        }

        if(o-lowNearestPrime>highNearestPrime-o){
            System.out.println("nearest prime number is"+highNearestPrime);
        }
        else{
            System.out.println("nearest prime no is "+lowNearestPrime);
        }
        // System.out.println("low "+lowNearestPrime);
        // System.out.println("high "+highNearestPrime);
    }
    
}