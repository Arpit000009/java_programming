package day;

import java.util.ArrayList;
import java.util.HashMap;

public class names {
    public static void main(String[] args) {
        String arr[] = {"sameer","darshan","virat","soumitro","vishal","memory","don","saiKishore","Arpit","arpit"};
        HashMap<Character,String>mpp = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for(String strr:arr){
            String str = strr.toLowerCase();
            if(!mpp.containsKey(str.charAt(0))){
                mpp.put(str.charAt(0), strr);
            }
            else{
                list.add(strr);
            }
        }
        System.out.println("printing the names in map");
        for(String value:mpp.values()){
            System.out.print(value+" ");
        }
        System.out.println();
        System.out.println("print the names present in array list");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
     }
}
