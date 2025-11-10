import java.util.Scanner;
public class binary {

   static int decimal(int n){
    int deci = 0;
    int i = 0;
        while(n>0){
            deci = deci + (n%10)*(int)Math.pow(2, i);
            n = n/10;
            i++;
        }
        return deci;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(decimal(num));
        sc.close();
    }
}
