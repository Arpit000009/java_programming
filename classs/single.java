import java.util.Scanner;
public class single {

    public static boolean issingle(int num){
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        if(count==1){
            return true;
        }
        return false;
    }
    public static int sum(int num){
        int sum = 0;
        while(num>0){
            sum =sum+ num%10;
            num = num/10;
        }
        
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(true){
            if(issingle(n)){
                System.out.println(n);
                break;
            }
            n = sum(n);
        }
    }
}
