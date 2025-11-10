import java.util.Scanner;
public class spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        while(n!=0){
            sum +=n%10;
            product *= n%10;
            n = n/10;
        }
        if(sum==product){
            System.out.println("spy number");
        }
        else{
            System.out.println("not a spy number");
        }
    }
}
