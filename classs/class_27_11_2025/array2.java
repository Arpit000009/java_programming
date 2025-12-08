package class_27_11_2025;

public class array2 {
    public static void main(String[] args) {
        int sum = 0;
       
        int arr[] = {2,7,3,6,2,3,7,1,7};
        int flag = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==6){
                flag = 1;
            }
            else if(flag==0){
                sum = sum + arr[i];
            }
            else if(arr[i]==7){
                flag = 0;
            }
            
        }
        System.out.println(sum);
       
    }
}
