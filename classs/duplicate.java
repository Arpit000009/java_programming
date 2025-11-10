import java.util.HashMap;
import java.util.Map;

public class duplicate {
     public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,3,2,1,4};
        Map<Integer,Integer> freq = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(freq.containsKey(arr[i])){
                freq.put(arr[i],freq.get(arr[i])+1);
            }
            else{
                freq.put(arr[i],1);
            }
        }

        int res[] = new int[freq.size()];
        int i = 0;
        
        for(int k:freq.keySet()){
            res[i] = k;
            i++;
        }
        for(int j=0;j<res.length;j++){
            System.out.print(res[j]+ " ");
        }
        int most = 0;
        int mostrepeat = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > most) {
                most = entry.getValue();
                mostrepeat = entry.getKey();
            }
        }
        System.out.println("\nmost repeating element is:"+mostrepeat);
    }
}
