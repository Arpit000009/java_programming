package class_25_11_2025;

public class pairedarray {

    static boolean paired(int arr[]) {
        if(arr.length%2!=0){
            return false;
        }

        for(int i=0;i<arr.length;i=i+2){
            if(arr[i]!=arr[i+1]){
                return false;
            }
        }
        return true;
    }
   public static void main(String[] args) {
       int arr[] = { 1, 2, 6, 6, 3, 3, 7, 7 };
       if(paired(arr)){
        System.out.println("paired");
       }
       else{
        System.out.println("not paired");
       }
   }

}
