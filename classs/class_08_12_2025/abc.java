package class_08_12_2025;

public class abc {
    public static void main(String[] args) {
        String s = "aaabbaaddddcctta";
        int count =1;
        
       
        String ch="";
        for(int i=0;i<s.length()-1;i++){
            if(ch==""){

                ch = ch + s.charAt(i);
            }
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
                
            }
            else{
                System.out.print(ch+count);
                count=1;
                ch = "";
            }

        }
        System.out.println(""+s.charAt(s.length()-1)+count);
    }
}
