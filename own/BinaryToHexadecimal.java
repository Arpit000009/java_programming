import java.util.Scanner;
public class BinaryToHexadecimal {

    static String tohexa(int n){
        String hex = "";
        char hexa[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        while(n>0){
            hex = hexa[n%16] + hex;
            n = n/16;
        }
        return hex;
    }
    static int todecimal(int n){
        int deci = 0;
        int i = 0;
        while(n>0){
            deci = deci + n%10*(int)Math.pow(2,i);
            i++;
            n = n/10;
        }
        return deci;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int decimal = todecimal(n);
    String hexa = tohexa(decimal);
    System.out.println(hexa);
    sc.close();
   } 
}
