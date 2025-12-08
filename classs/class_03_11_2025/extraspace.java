package class_03_11_2025;

public class extraspace {
    public static void main(String[] args) {
        String str = "hello  hi  byee   xyvhh    bhug";
        String res = "";
        int flag = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                res =res+ str.charAt(i);
                flag = 0;
            }
            else if(str.charAt(i)==' '&&flag==0){
                res = res+' ';
                flag = 1;
            }

        }
        System.out.println(res);
    }
}
