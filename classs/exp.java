import java.util.Scanner;
public class exp {
    public static int expo(int num,int e){
        int m = 1;
        while(e>0){
            m = m*num;
            e--;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int exp = sc.nextInt();
        System.out.println(expo(num,exp));
        System.out.println(Math.pow(num, exp));
    }
}
