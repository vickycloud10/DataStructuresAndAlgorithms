package Arrays;

/*
 * 
 * 
 * Rotate Array:
 * 
 * Level : medium
 * 
 * 
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * 
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * 
 * Example 2:
 * 
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * 
 * Explanation: 
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 105
 * 
 * -231 <= nums[i] <= 231 - 1
 * 
 * 0 <= k <= 105
 * 
 */


public class RotateArray {
    
    public static void rotate(int []array, int rotation) {
        reverse(array, 0, array.length - 1);
        reverse(array, 0, rotation - 1);
        reverse(array, rotation, array.length - 1);

        for (int number : array) {
            System.out.print(number+" ");
        };
    }

    public static void reverse(int []array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [] sampleArray = {1,2,3,4,5,6,7};
        int rotation = 3;

        rotate(sampleArray, rotation);
    }    
}
