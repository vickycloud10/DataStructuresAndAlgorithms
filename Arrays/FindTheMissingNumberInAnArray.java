package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * 
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * 
 * Example 1:
 * Input: nums = [3,0,1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
 * 
 * Example 2:
 * Input: nums = [0,1]
 * Output: 2
 * Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
 * 
 * Example 3:
 * Input: nums = [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 * 
 * Constraints:
 * 
 * n == nums.length
 * 
 * 1 <= n <= 104
 * 
 * 0 <= nums[i] <= n
 * 
 * All the numbers of nums are unique.
 * 
 */

public class FindTheMissingNumberInAnArray {

    // Using normal sorting approach
    //Time complexity o(n)
    //space complexity o(n)
    //takes --> 5ms
    public static int missingNumberUsingHashMap(int[] nums) {
        Map<Integer, Integer> temporaryMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            temporaryMap.put(nums[i], nums[i]);
        }

        for(int i = 0; i <= nums.length; i++){
            if(temporaryMap.get(i) == null){
                return i;
            }
        }

        return 0;
    }

    // Using normal sorting approach
    //Time complexity o(nlogn)
    //space complexity o(1)
    public static int missingNumberNormalSortingMechanism(int[] nums) {
        Arrays.sort(nums);

        int arrayLength = nums.length;

        if(nums[0] != 0){
            return 0;
        }

        if(arrayLength != nums[arrayLength - 1]){
            return arrayLength;
        }

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != i){
                return i;
            }
        }

        return 0;
    }

    // Using the cyclic sort approach
    //Time complexity o(n)
    //space complexity o(1)
    //takes --> 0 ms
    public static int missingNumberUsingCyclicSortApproach(int[] nums) {
        int lengthOfNumsArray = nums.length;
        int index = 0;

        while(index < nums.length){
            int valueOfArrayInIndex = nums[index];
            boolean isValueInRange = valueOfArrayInIndex < nums.length;

            if(isValueInRange && nums[valueOfArrayInIndex] != nums[index]){
                int temp = nums[valueOfArrayInIndex];
                nums[valueOfArrayInIndex] = nums[index];
                nums[index] = temp;
            } else {
                index++;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(i != nums[i]){
                return i;
            }
        }
        return lengthOfNumsArray;
    }

    // Using the formula of sum of the first 'n natural numbers' sum = n * (n + 1)/ 2
    //Time complexity o(n)
    //space complexity o(1)
    //takes --> 0 ms
    public static int missingNumberUsingNaturalNumberFormula(int[] nums) {
        int length = nums.length;
        int expectedSumOfAllTheNaturalNumbers = length * (length + 1)/2;
        int sumOfNumsArray = 0;

        for(int num : nums){
            sumOfNumsArray += num;
        }
        
        return expectedSumOfAllTheNaturalNumbers - sumOfNumsArray;
    }

    public static void main(String[] args) {
        int sampleArrayOne [] = {9,6,4,2,3,5,7,0,1};
        int sampleArrayTwo [] = {3,0,1}; 
        int sampleArrayThree [] = {0,1};       

        System.out.println("---Finding the missing number using the sum of first n natural numbers formula---");
        System.out.println(missingNumberUsingNaturalNumberFormula(sampleArrayOne));
        System.out.println(missingNumberUsingNaturalNumberFormula(sampleArrayTwo));
        System.out.println(missingNumberUsingNaturalNumberFormula(sampleArrayThree));

        System.out.println("---Finding the missing number using cyclic sort approach---");
        System.out.println(missingNumberUsingCyclicSortApproach(sampleArrayOne));
        System.out.println(missingNumberUsingCyclicSortApproach(sampleArrayTwo));
        System.out.println(missingNumberUsingCyclicSortApproach(sampleArrayThree));

        System.out.println("---Finding the missing number using Hashmap---");
        System.out.println(missingNumberUsingHashMap(sampleArrayOne));
        System.out.println(missingNumberUsingHashMap(sampleArrayTwo));
        System.out.println(missingNumberUsingHashMap(sampleArrayThree));

        System.out.println("---Finding the missing number using Sorting---");
        System.out.println(missingNumberNormalSortingMechanism(sampleArrayOne));
        System.out.println(missingNumberNormalSortingMechanism(sampleArrayTwo));
        System.out.println(missingNumberNormalSortingMechanism(sampleArrayThree));
    }
}
