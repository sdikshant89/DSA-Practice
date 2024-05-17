package main.java.com.dataStructs.arrays;
import main.java.com.utils.Utils;
public class SubArraySum {

    // The time complexity of this (bruteforce) is O(n^3)
    public static Integer[] find_SubArray_Sum(Integer[] arr){
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        int curr_sum = 0;
        Integer[] my_arr = new Integer[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                curr_sum = 0;
                for(int k=i; k<=j;k++){
                    curr_sum += arr[k];
                }
                if(max_sum < curr_sum){
                    max_sum = curr_sum;
                }if (curr_sum < min_sum) {
                    min_sum = curr_sum;
                }
            }
        }
        my_arr[0] = min_sum;
        my_arr[1] = max_sum;
        return my_arr;
    }

    public static Integer[] get_prefix_sum_arr(Integer[] arr){
        Integer[] prefix_sum_arr = new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            prefix_sum_arr[i] = i==0 ? arr[i] : arr[i] + prefix_sum_arr[i-1];
        }
        return prefix_sum_arr;
    }

    // Prefix[end] - Prefix[start - 1] = sum between start and end
    // The time complexity of this (Prefix) is O(n^2)
    public static Integer[] find_SubArray_Sum_prefix(Integer[] arr){
        Integer[] prefix_arr = get_prefix_sum_arr(arr);
        Integer[] my_arr = new Integer[2];
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        int curr_sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                curr_sum = i == 0 ? prefix_arr[j] : prefix_arr[j] - prefix_arr[i-1];
                if(max_sum < curr_sum){
                    max_sum = curr_sum;
                }if (curr_sum < min_sum) {
                    min_sum = curr_sum;
                }
            }
        }
        my_arr[0] = min_sum;
        my_arr[1] = max_sum;
        return my_arr;
    }

    // According to kadane if the sum of the substring is negative, need not to consider that
    // We can ignore that part of the substring and instead of -ve we will put it as 0 (zero)
    // In an array, iterate once, if have any initial -ve values, just don't consider them
    // Instead of adding the initial -ve to the current_sum(a new variable defined)
    // Start adding from where you find the +ve number and all the -ve numbers which come after
    // They are supposed to be negated from the current_sum but keep another variable (max_sum) as the max value you get

    public static Integer kadanes(Integer[] arr){
        Integer max_sum = Integer.MIN_VALUE;
        Integer curr_sum = 0;
        boolean allNegative = true;
        int maxElement = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if (arr[i] > 0) {
                allNegative = false;
            }
            maxElement = Math.max(maxElement, arr[i]);

            curr_sum = curr_sum + arr[i];
            if(curr_sum<0){
                curr_sum = 0;
            }
            max_sum = Math.max(curr_sum, max_sum);
        }
        if (allNegative) {
            return maxElement;
        }
        return max_sum;
    }

    public static void main(String[] args) {
        // Integer[] arr = Utils.inputIntArray();
        // Integer[] arr = {1,-2,6,-1,3};
        Integer[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        Integer[] new_arr = find_SubArray_Sum(arr);
        System.out.println("Max Sum:" + new_arr[1].toString() + "\nMin sum:" + new_arr[0].toString());
        new_arr = find_SubArray_Sum_prefix(arr);
        System.out.println("Prefix Method:\nMax Sum:" + new_arr[1].toString() + "\nMin sum:" + new_arr[0].toString());
        System.out.println("kadanes Method:\nMax Sum:" + kadanes(arr).toString());
    }
}
