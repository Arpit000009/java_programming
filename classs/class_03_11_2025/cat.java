package class_03_11_2025;

public class cat {
    public static void main(String[] args) {
        String str = "abdogchencatbdogcathenxycdogatcat";
        String c = "abd";
        int j = 0;
        int k = 0;
        int count = 0;
        while(k<str.length()-2){
            String s = "";
            for(int i=k;i<k+c.length();i++){
                s = s+ str.charAt(i);
            }
            if(s.equals(c)){
                count++;
            }
            k++;
        }
        System.out.println(count);
    }
}
