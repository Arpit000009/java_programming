import java.util.Scanner;
public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int perfectno = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.print(i+" ");
                perfectno = perfectno + i;
                count++;
            }
        }
        System.out.print(n);
        System.out.println("\nthe no of factors are: "+count);
        sc.close();
        if(count == 2){
            System.out.println("it is a prime number");
        }
        else{
            System.out.println("not a prime number");
        }

        if(perfectno == n){
            System.out.println("number is perfect");
        }
        else{
            System.out.println("no is not perfect");
        }
    }
}
