import java.util.Scanner;
public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        while(n!=0){
            if(n%10!=0){
                product *= n%10;
            }
            n = n/10;
        }
        System.out.println(product);
    }
}
