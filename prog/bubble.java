package prog;

public class bubble {
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,3,5,2,5};
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
