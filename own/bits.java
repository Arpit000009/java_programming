import java.util.Scanner;

public class bits {

    static int countBitsone(int num){
        int count = 0;
        while(num>0){
            if(num%2==1){
                count++;
            }
            num = num/2;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("no of bits which are one:"+countBitsone(n));
    }
}
