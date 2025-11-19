package class_18_11_2025;

public class upperlow {
   public static void main(String[] args) {
     String str = "hello hi123 ABC";
     String res = "";
     for(int i=0;i<str.length();i++){
        char abc = str.charAt(i);
        if(abc>='a'){
            abc = (char) (abc -32);
           res = res+ abc;

        }
        else if(abc>=65 && abc<=97){
            abc = (char)(abc+32);
            res = res + abc;
        }
        else{
            res = res + abc;
        }
     }
     System.out.println(res);
   }
}
