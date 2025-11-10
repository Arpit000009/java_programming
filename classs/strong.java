import java.util.Scanner;
public class strong {
    public static int factorial(int num){
        int fact = 1;
        while(num>0){
            fact = fact*num;
            num--;
        }
        return fact;
    }

    public static int strongg(int num){
        int s = 0;
        while(num>0){
            s = s+ factorial(num%10);
            
           num = num/10;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==strongg(n)){
            System.out.println("strong number");
        }
        else{
            System.out.println("not a strong number");
        }
        
    }
}
