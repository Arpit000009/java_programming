package arrays;

public class sum {

    static int factorial(int n){
        int fact = 1;
        while(n>0){
            fact = fact*n;
            n--;
        }
        return fact;
    }

    static boolean isprime(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }

        if(count == 2){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[] = { 5,5,5,5,5 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
        System.out.println(sum);
        if(isprime(sum)){
            System.out.println("sum of array is prime");
        }
        else{
            System.out.println("sum of array is not prime");
        }
        int factsum = 0;
        for(int i=0;i<arr.length;i++){
            factsum = factsum + factorial(arr[i]);
        }
        System.out.println("sum of factorial of elements are:"+ factsum);
        int primesum = 0;
        for(int i=0;i<arr.length;i++){
            if(isprime(i)){
                primesum = primesum +arr[i];
            }
        }
        System.out.println("prime index sum = "+ primesum);
    }
}
