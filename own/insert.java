public class insert {
    public static int[] insertat(int arr[],int n,int element){
        int res[] = new int[arr.length+1];
        int i = 0;
        while(i<n){
            res[i] = arr[i];
            i++;
        }
        res[n] = element;
        
        while(i<arr.length){
            res[i+1] = arr[i];
            i++;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int n = 3;
        int elelment = 7;

        int res[]=insertat(arr,n,elelment);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
