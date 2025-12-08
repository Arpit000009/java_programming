package class_03_11_2025;

public class catc {
    public static void main(String[] args) {
        String str = "asdfghjkcatsdfghjcatfghjcat";
        int count = 0;
        for(int i=0;i<str.length()-2;i++){
            if(str.charAt(i)=='c'&&str.charAt(i+1)=='a'&&str.charAt(i+2)=='t'){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
