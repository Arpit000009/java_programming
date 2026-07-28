package numberysstem;
import java.util.Scanner;

public class gcd {

    public static int gcd(int num1,int num2){
        if(num1==0||num2==0){
            return Math.max(num1,num2);
        }

        int result = Math.min(num1,num2);
        while(result>0){
            if(num1%result==0 && num2%result==0){
                return result;
            }
            result--;
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans = gcd(num1,num2);
        System.out.println(ans);
    }
}
