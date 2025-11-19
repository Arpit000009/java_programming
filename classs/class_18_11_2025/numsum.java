package class_18_11_2025;

public class numsum {
    public static void main(String[] args) {
        String str = "hello345dkjsfjan 90";
        String sum = "";
        for(int i=0;i<str.length();i++){
            char temp = str.charAt(i) ;
            if(Character.isAlphabetic(temp)){
               sum=sum+temp;
            }
            
        }
        System.out.println(sum);
    }
}
