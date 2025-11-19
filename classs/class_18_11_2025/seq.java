package class_18_11_2025;

public class seq {
    public static void main(String[] args) {
        String str = "hel12 Bye@14 h88I";
        String res = "";
        for(int i= 0;i<str.length();i++){
            if(str.charAt(i)>'A' && str.charAt(i)<='z'){
                res = res + str.charAt(i);
            }
        }
        for(int i=0;i<str.length();i++){
            if((int)(str.charAt(i))>=0 && (int)(str.charAt(i))<=9){
                res = res + (int)(str.charAt(i));
            }
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<65 && (int)(str.charAt(i))<0 && (int)(str.charAt(i))>9){
                res = res + str.charAt(i);
            }
        }
        System.out.println(res);
    }
}
