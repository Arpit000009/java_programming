import java.util.Arrays;

public class bigSmall {
    public static void main(String[] args) {
        int arr[] = {190,2,33,4,45,64,17,82};
        int small = 4;
        Arrays.sort(arr);
        System.out.println(arr[small-1]);
        int big = 3;

        System.out.println(arr[arr.length-big]);
    }
}
