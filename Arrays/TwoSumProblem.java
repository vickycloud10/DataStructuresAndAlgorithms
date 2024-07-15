package Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Problem Definition :
 * Two Sum :
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * 
 * Level:
 * Easy
 * 
 * Example 1 : 
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2 :
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Solution : 
 * Here, we will pick the elements of the array one by one and 
 * we will subtract the respective value of the element with the target (i.e: target - array[i])
 * This is done to fine the second element of the sum and if it is not making up the target means we will
 * be storing that element in the hashmap until we find the relevant pair once we found the sum we will print them.
 */

public class TwoSumProblem {
    public static void main(String[] args) {
        int array [] = {2,7,11,15};
        int answer[] = new int[2];
        int target = 9;

        Map<Integer, Integer> processMap = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            int secondNumber = target - array[i];
            if(processMap.containsKey(secondNumber)){
                answer[0] = i;
                answer[1] = processMap.get(secondNumber);
                break;
            }
            processMap.put(array[i], i);
        }
        System.out.println(answer[0]+"  "+answer[1]);
    }
}
