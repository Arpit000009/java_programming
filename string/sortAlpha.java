package string;

import java.util.HashMap;

public class sortAlpha {
   static String sort(String str){
        HashMap<Character,Integer>mpp = new HashMap<>();
        String result = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(mpp.containsKey(ch)){
                int count = mpp.get(ch);
                mpp.put(ch,count+1);
            }
            else{
                mpp.put(ch,1);
            }
            
            for(int j=0;j<26;j++){
                char c = (char)(j+97);
                if(mpp.containsKey(c)){
                    int times = mpp.get(c);
                    while(times>0){
                        result= result+c;
                        times--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "aabbddggcca";
        System.out.println(sort(str));
    }
}
