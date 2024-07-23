package Arrays;

/*
 * 
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * 
 * 
 * Example 2:
 * 
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * 
 * 
 * Example 3:
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 * 
 * 
 * Constraints:
 * 
 * 0 <= nums.length <= 105
 * 
 * -109 <= nums[i] <= 109
 * 
 * nums is a non-decreasing array.
 * 
 * -109 <= target <= 109
 * 
 */


public class FindFirstAndLastPositionOfElementsInASortedArray {

    //recursive binary search
    public int recursiveBinarySearch(int[] nums, int left, int right, int target, boolean isSearchingLeft) {

        if(right >= left){

            int middle = left + (right - left)/2;

            if(nums[middle] > target){
                return recursiveBinarySearch(nums, left, middle - 1, target, isSearchingLeft);
            } else if (nums[middle] < target) {
                return recursiveBinarySearch(nums, middle + 1, right, target, isSearchingLeft);
            } else {
                if(isSearchingLeft){
                    int index = recursiveBinarySearch(nums, left, middle - 1, target, isSearchingLeft);
                    return index == -1 ? middle : index;
                } else {
                    int index = recursiveBinarySearch(nums, middle + 1, right, target, isSearchingLeft);
                    return index == -1 ? middle : index;
                }
            }

        }
        return -1;
    }

    //iterative binary search for higher bound
    public int binarySearch(int[] nums, int target, boolean isSearchingLeft) {
        
        int index = -1;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){

            int mid = left + (right - left)/2;

            if(nums[mid] > target){
                right = mid - 1;
            } else if(nums[mid] < target){
                left = mid + 1;
            } else {
                index = mid;
                if(isSearchingLeft){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return index;
    }

    public int[] searchRange(int[] nums, int target) {

        return new int[]{binarySearch(nums, target, true), binarySearch(nums, target, false)};
    }

    public int[] secondSearchRange(int[] nums, int target) {

        return new int[]{recursiveBinarySearch(nums, 0, nums.length - 1, target, true), recursiveBinarySearch(nums,  0, nums.length - 1, target, false)};
    }

    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 8;
  
        int [] sampleArrayOne = {5,7,7,8,8,10};
        int targetSampleForOne = 6;

        int [] sampleArrayTwo = {};
        int targetSampleForTwo = 0;

        int [] sampleArrayThree = {1,2,2};
        int targetSampleForThree = 2;

        int [] sampleArrayFour = {2,2};
        int targetSampleForFour = 2;

        int [] sampleArrayFive = {1, 1, 2, 2, 2, 2, 2, 3, 4, 4, 5};
        int targetSampleForFive = 2;
        
        FindFirstAndLastPositionOfElementsInASortedArray f1 = new FindFirstAndLastPositionOfElementsInASortedArray();
        int []resultArray = f1.searchRange(nums, target);
        int []resultArrayOne = f1.searchRange(sampleArrayOne, targetSampleForOne);
        int []resultArrayTwo = f1.searchRange(sampleArrayTwo, targetSampleForTwo);
        int []resultArrayThree = f1.searchRange(sampleArrayThree, targetSampleForThree);
        int []resultArrayFour = f1.searchRange(sampleArrayFour, targetSampleForFour);
        int []resultArrayFive = f1.searchRange(sampleArrayFive, targetSampleForFive);

        int []resultRecursiveArray = f1.secondSearchRange(nums, target);
        int []resultRecursiveArrayOne = f1.secondSearchRange(sampleArrayOne, targetSampleForOne);
        int []resultRecursiveArrayTwo = f1.secondSearchRange(sampleArrayTwo, targetSampleForTwo);
        int []resultRecursiveArrayThree = f1.secondSearchRange(sampleArrayThree, targetSampleForThree);
        int []resultRecursiveArrayFour = f1.secondSearchRange(sampleArrayFour, targetSampleForFour);
        int []resultRecursiveArrayFive = f1.secondSearchRange(sampleArrayFive, targetSampleForFive);

        System.out.println("\n----------Iterative Binary search begins----------\n");

        System.out.println("["+resultArray[0]+","+resultArray[1]+"]");
        System.out.println("["+resultArrayOne[0]+","+resultArrayOne[1]+"]");
        System.out.println("["+resultArrayTwo[0]+","+resultArrayTwo[1]+"]");
        System.out.println("["+resultArrayThree[0]+","+resultArrayThree[1]+"]");
        System.out.println("["+resultArrayFour[0]+","+resultArrayFour[1]+"]");
        System.out.println("["+resultArrayFive[0]+","+resultArrayFive[1]+"]");

        System.out.println("\n----------Recursive Binary search begins----------\n");

        System.out.println("["+resultRecursiveArray[0]+","+resultRecursiveArray[1]+"]");
        System.out.println("["+resultRecursiveArrayOne[0]+","+resultRecursiveArrayOne[1]+"]");
        System.out.println("["+resultRecursiveArrayTwo[0]+","+resultRecursiveArrayTwo[1]+"]");
        System.out.println("["+resultRecursiveArrayThree[0]+","+resultRecursiveArrayThree[1]+"]");
        System.out.println("["+resultRecursiveArrayFour[0]+","+resultRecursiveArrayFour[1]+"]");
        System.out.println("["+resultRecursiveArrayFive[0]+","+resultRecursiveArrayFive[1]+"]");
    }    
}
