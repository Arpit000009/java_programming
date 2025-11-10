import java.util.ArrayList;

public class movezerosToEnd {
    public static void main(String[] args) {
        int a[] = {0,3,4,0,6,7,0};
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                count++;
            }
            else{
                arr.add(a[i]);
            }
        }
        while(count>0){
            arr.add(0);
            count--;
        }

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
