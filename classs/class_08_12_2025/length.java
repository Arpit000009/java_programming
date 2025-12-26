package class_08_12_2025;

public class length {
   public static void main(String[] args) {
     int arr[] = {1,2,2,4,5,6,7,8,9};
     int i=0;
    while(true){
        try {
            if(arr[i]==arr[i]){
            i++;
            }
        } catch (Exception e) {
            
            System.out.println(i);
            break;
        }
    }
   }
}
