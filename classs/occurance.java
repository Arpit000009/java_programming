import java.util.HashMap;
import java.util.Map;

public class occurance {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,3,2,1};
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
        for(int k:freq.values()){
            res[i] = k;
            i++;
        }
        for(int j=0;j<res.length;j++){
            System.out.print(res[j]+ " ");
        }
    }
}
