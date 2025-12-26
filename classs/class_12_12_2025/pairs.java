public class pairs {
    public static void main(String[] args) {
        int arr[] = {2,3,3,4,4,5,5,5,6,7,7,7,8,9,10};
        int i=0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==10){
                System.out.println(arr[i]+" "+arr[j]);
                i++;
                j--;
            }
            if(arr[i]+arr[j]>10){
                j--;
            }
            if(arr[i]+arr[j]<10){
                i++;
            }
            
        }
    }
}
