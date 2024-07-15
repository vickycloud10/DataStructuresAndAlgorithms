package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *
 * Four sum problem from leet code 
 *  
 * Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
 * 0 <= a, b, c, d < n
 * a, b, c, and d are distinct.
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * You may return the answer in any order.
 * Example 1:
 * Input: nums = [1,0,-1,0,-2,2], target = 0
 * Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 * 
 * Example 2:
 * Input: nums = [2,2,2,2,2], target = 8
 * Output: [[2,2,2,2]]
 * 
 * 
 */

 //Below used solution is of two pointer approach

public class FourSomeLeetCode {
    private static List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        List<List<Integer>> listOfArrays = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {

            //avoid duplicates from i pointer
            if(i > 0 && nums[i] == nums[i - 1]){
                i++;
            }
            
            for(int j = i + 1; j < nums.length - 2; j++){

                //avoid duplicates from j pointer
                if(j > i + 1 && nums[j] == nums[j - 1]){
                    j++;
                }

                int left = j + 1;
                int right = nums.length - 1;
                int actualTarget = target - nums[i] - nums[j];

                while(left < right){
                    if(nums[left] + nums[right] == actualTarget){
                        List<Integer> listOfIntegers = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
                        //Before adding just check the sum if it is going beyond int memory value. If it is going beyond means dont add the value
                        long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                        if(sum == target){
                            listOfArrays.add(listOfIntegers);
                        }
                        left++;
                        right--;
                       
                        //avoid duplicates from left pointer
                        while(left < right && nums[left] == nums[left - 1]){
                            left++;
                        }

                        //avoid duplicated from right pointer
                        while(left < right && nums[right] == nums[right + 1]){
                            right--;
                        }

                    } else if(nums[left] + nums[right] < actualTarget){
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return listOfArrays;
    }

    public static void main(String[] args) {
        int firstSampleArray [] = {1,0,-1,0,-2,2};
        int secondSampleArray [] = {2,2,2,2,2};
        int thirdSampleArray [] = {0,0,0,0};
        int fourthSampleArray [] = {1000000000,1000000000,1000000000,1000000000};
        int fifthSampleArray [] = {-1000000000,-1000000000,1000000000,-1000000000,-1000000000};
        System.out.println(fourSum(firstSampleArray, 0));
        System.out.println(fourSum(secondSampleArray, 8));
        System.out.println(fourSum(thirdSampleArray, 0));
        System.out.println(fourSum(fourthSampleArray, -294967296));
        System.out.println(fourSum(fifthSampleArray, 294967296));
    }
}
