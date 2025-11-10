public class panagram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        if(isanagram(str)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }
        
    }
    public static boolean isanagram(String str){
        boolean[] letter = new boolean[26];
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&& str.charAt(i)<='z'){
                letter[str.charAt(i)-'a'] = true;
            }
        }

        for(boolean present: letter){
            if(!present){
                return false;
            }
        }
        return true;
    }
}
