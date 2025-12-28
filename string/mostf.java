package string;

import java.util.HashMap;
import java.util.Map.Entry;

public class mostf {
    public static void main(String[] args) {
        String str = "IAMARPIT";

        HashMap<Character, Integer> mpp = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            int count;
            char ch = str.charAt(i);
            if (mpp.containsKey(ch)) {
                count = mpp.get(ch);
                mpp.put(ch, count + 1);
            } else {

                mpp.put(ch, 1);
            }
        }
        int max = 0;
        char charr = ' ';
        for(Entry<Character, Integer> entry:mpp.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                charr = entry.getKey();
            }
        }
        System.out.println(charr);

    }
}
