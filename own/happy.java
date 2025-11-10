import java.util.Scanner;
public class happy {

    static int ret(int num){
        int res = 0;
        while(num>0){
            res = res + (num%10*num%10);
            num = num/10;
        }
        return res;
    }

    static int isHappy(int num){
        
        while(true){
            int c = ret(num);
            if(num>9){
                return 0;
            }
            else if(c==1){
                return 1;
            }
            num = c;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isHappy(n));
    }
}
