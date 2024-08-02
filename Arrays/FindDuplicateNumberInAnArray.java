package Arrays;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * There is only one repeated number in nums, return this repeated number.
 * You must solve the problem without modifying the array nums and uses only constant extra space.
 * 
 * Example 1:
 * Input: nums = [1,3,4,2,2]
 * Output: 2
 * 
 * Example 2:
 * Input: nums = [3,1,3,4,2]
 * Output: 3
 * 
 * Example 3:
 * Input: nums = [3,3,3,3,3]
 * Output: 3
 * 
 * Constraints:
 * 
 * 1 <= n <= 105
 * 
 * nums.length == n + 1
 * 
 * 1 <= nums[i] <= n
 * 
 * All the integers in nums appear only once except for precisely one integer which appears two or more times.
 * 
 */

public class FindDuplicateNumberInAnArray {


    //Binary search doesn't seem to be an efficient algorithm in this approach 
    // Hence it is better to use hare and tortoise algorithm or fast and slow pointer algorithm
    public static int findDuplicateUsingFastAndSlowPointerAlgorithm(int[] nums) {
        int slow = 0;
        int fast = 0;

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        slow = 0;

        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    //Source array modification cannot be used if the interviewer or code competition asks us not to modify the array
    public static int findDuplicateUsingSourceArrayModification(int[] nums) {
        //for avoiding source array modification so that the actual array
        // is available for other methods or algorithms without modifications
        int temp [] = nums;
        for(int num: temp){
            int index = Math.abs(num);
            if(temp[index] < 0){
                return index;
            }
            temp[index] = -temp[index];
        }
        return temp.length;
    }

    public static int findDuplicateUsingFrequencyMap(int[] nums) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(frequencyMap.get(nums[i]) != null){
                return nums[i];
            } else {
                frequencyMap.put(nums[i], 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int sampleArrayOne [] = {1,3,4,2,2};
        int sampleArrayTwo [] = {3,1,3,4,2};
        System.out.println("----Using Frequency map method----");
        System.out.println(findDuplicateUsingFrequencyMap(sampleArrayOne));
        System.out.println(findDuplicateUsingFrequencyMap(sampleArrayTwo));
        System.out.println("----Fast and slow pointer algorithm or in otherwords tortoise and hare algorithm----");
        System.out.println(findDuplicateUsingFastAndSlowPointerAlgorithm(sampleArrayOne));
        System.out.println(findDuplicateUsingFastAndSlowPointerAlgorithm(sampleArrayTwo));
        System.out.println("----Source Array modification method----");
        System.out.println(findDuplicateUsingSourceArrayModification(sampleArrayOne));
        System.out.println(findDuplicateUsingSourceArrayModification(sampleArrayTwo));
    }
    
}
