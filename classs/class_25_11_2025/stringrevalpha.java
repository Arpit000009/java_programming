package class_25_11_2025;

public class stringrevalpha {
    public static void main(String[] args) {
        String str = "A12C#E1DE";
        char [] ch = str.toCharArray();
        String res = "";
        for(int i=0;i<ch.length;i++){
            if(Character.isAlphabetic(ch[i])){
                res = res + ch[i];
            }
        }

        char [] ch2 = res.toCharArray();
        int j = ch2.length-1;
        for(int i=0;i<ch.length;i++){
            if(Character.isAlphabetic(ch[i])){
                ch[i] = ch2[j];
                j--;
            }
        }

        String one = "";
        for(int i=0;i<ch.length;i++){
            one = one +ch[i];
        }
        System.out.println(one);
    }
}
