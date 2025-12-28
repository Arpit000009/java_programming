package string;

public class countS {
    public static void main(String[] args) {
        String str = "r#m !s g**d";
        str = str+" ";
        String word = "";
        int count = 0;
        for( int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            word = word + ch;
            if(!Character.isLetter(ch) && ch!=' '){
                count++;

            }
            if(ch==' '){
                System.out.println(word + " = " + count);
                word  = "";
                count = 0;
            }
        }
    }
}
