class rev{

public static void main(String[] args) {
    String str = "56+arpit#ki1";
    char [] ch = str.toCharArray();
    int i = 0;
    int j = ch.length-1;
    while(i<j){
       
            if(!Character.isAlphabetic(ch[i])){
                i++;
                continue;
            }
            if(!Character.isAlphabetic(ch[j])){
                j--;
                continue;
            }
            char a = ch[i];
            ch[i] = ch[j];
            ch[j] = a;
            i++;
            j--;
        
    }
    String ans = "";
    for(int k=0;k<ch.length;k++){
        ans = ans+ch[k];
    }
    System.out.println(ans);
}
}