package class_03_11_2025;

public class count {
    public static void main(String[] args) {
        String str = "hello hi welcome bye";
        int c = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                c++;
            }
            else{
                System.out.print(c);
                c = 0;
            }
        }
        System.out.print(c);
    }
}
