import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        while(n>0){
            s = n%2 + s;
            n = n/2;
        }
        int num = Integer.parseInt(s);
        System.out.println(num);
        sc.close();
    }
}
