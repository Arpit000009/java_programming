////// Longest Consecutive Subsequence (by values, not positions) give full code in java
package day;

import java.util.HashSet;

public class one {

    public static int longestConsecutive(int arr[]){
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int longest = 0;

        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int count = 1;
            while(set.contains(num+1)){
                count++;
                num = num+1;
            }
            longest = Math.max(count, longest);
        }
        return longest;
    }
    public static void main(String[] args) {

        int[] arr = { 100, 4, 200, 1, 3, 2 , 5,101,102,103,104,105,106};

        int result = longestConsecutive(arr);

        System.out.println("Length of Longest Consecutive Subsequence: " + result);
    }
}
