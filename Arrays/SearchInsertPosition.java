package Arrays;

/*
 *
 * Level : Easy
 * 
 * Search Insert Position:
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Example 1:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * 
 * Example 2:
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * 
 * Example 3:
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 104
 * 
 * -104 <= nums[i] <= 104
 * 
 * nums contains distinct values sorted in ascending order.
 * 
 * -104 <= target <= 104
 * 
 */

public class SearchInsertPosition {

    public static int binarySearch(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){

            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return left;
    }

    public static void main(String[] args) {

        int sampleArrayOne [] = {1,3,5,6};
        int sampleArrayOneTarget = 5;

        int sampleArrayTwo [] = {1,3,5,6};
        int sampleArrayTwoTarget = 2;

        int sampleArrayThree [] = {1,3,5,6};
        int sampleArrayThreeTarget = 7;
        
        System.out.println(binarySearch(sampleArrayOne, sampleArrayOneTarget));
        System.out.println(binarySearch(sampleArrayTwo, sampleArrayTwoTarget));
        System.out.println(binarySearch(sampleArrayThree, sampleArrayThreeTarget));
    }
    
}
