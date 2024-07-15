package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * Notice that the solution set must not contain duplicate triplets.
 * 
 * Example 1:
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation: 
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 *
 * 
 * Example 2:
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 * 
 * 
 * Example 3:
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 * 
 */

public class ThreeSumLeetCode {

    private static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> listOfArrays = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
             int left = i + 1;
             int right = nums.length - 1;
             int target = -nums[i];

             if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

             while(left < right){

                if(nums[left] + nums[right] == target){
                    List<Integer> listOfIntegers = Arrays.asList(nums[i], nums[left], nums[right]);
                    listOfArrays.add(listOfIntegers);
                    left++;
                    right--;

                    if (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    if (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if(nums[left] + nums[right] < target){
                    left++;
                } else {
                    right--;
                }
             }
        }
        return listOfArrays;
    }
    public static void main(String[] args) {
        int sampleArrayOne[] = {-1,0,1,2,-1,-4};
        int sampleArrayTwo[] = {0,0,0,0};
        int sampleArrayThree[] = {-2,0,1,1,2};
        int sampleArrayFour[] = {-2,0,0,2,2};
        int sampleArrayFive[] = {1,-1,-1,0};
        System.out.println(threeSum(sampleArrayOne));
        System.out.println(threeSum(sampleArrayTwo));
        System.out.println(threeSum(sampleArrayThree));
        System.out.println(threeSum(sampleArrayFour));
        System.out.println(threeSum(sampleArrayFive));
    }
}
