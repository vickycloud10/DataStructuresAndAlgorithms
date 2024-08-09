package Arrays;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * Majority Element:
 * 
 * Level : Easy
 * 
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * 
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 * 
 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 * 
 * Constraints:
 * 
 * n == nums.length
 * 
 * 1 <= n <= 5 * 104
 * 
 * -109 <= nums[i] <= 109
 * 
 */

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer>frequencyMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(frequencyMap.get(nums[i]) != null){
                frequencyMap.put(nums[i], frequencyMap.get(nums[i]) + 1);
            } else {
                frequencyMap.put(nums[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            if(entry.getValue() > nums.length/2){
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int sampleNumberOne [] = {3,2,3};
        int sampleNumberTwo [] = {2,2,1,1,1,2,2};
        
        System.out.println(majorityElement(sampleNumberOne));
        System.out.println(majorityElement(sampleNumberTwo));
    }    
}
