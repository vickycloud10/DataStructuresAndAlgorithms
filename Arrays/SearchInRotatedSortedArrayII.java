package Arrays;


public class SearchInRotatedSortedArrayII {

    public static boolean simpleSolutionWithoutBinarySearch(int[]nums, int target) {
        for(int num: nums){
            if(num == target){
                return true;
            }
        }
        return false;
    }

    public static boolean search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                return true;
            }

            //for finding duplicates and iterating over it
            if(nums[left]==nums[mid]&& nums[mid]==nums[right]) {
                left++;
                right--;
                continue;
            }

            
            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int sampleArrayOne[] = {2,5,6,0,0,1,2};
        int sampleTarget = 0;

        int sampleArrayTwo[] = {2,5,6,0,0,1,2};
        int sampleTargetTwo = 3;

        int sampleArrayThree[] = {1,0,1,1,1};
        int sampleTargetThree = 0;

        int sampleArrayFour[] = {1,3};
        int sampleTargetFour = 1;

        int sampleArrayFive[] = {5,1,3};
        int sampleTargetFive = 1;

        System.out.println("----With binary search----");

        System.out.println(search(sampleArrayOne, sampleTarget));
        System.out.println(search(sampleArrayTwo, sampleTargetTwo));
        System.out.println(search(sampleArrayThree, sampleTargetThree));
        System.out.println(search(sampleArrayFour, sampleTargetFour));
        System.out.println(search(sampleArrayFive, sampleTargetFive));

        System.out.println("----Simple solution without binary search----");

        System.out.println(simpleSolutionWithoutBinarySearch(sampleArrayOne, sampleTarget));
        System.out.println(simpleSolutionWithoutBinarySearch(sampleArrayTwo, sampleTargetTwo));
        System.out.println(simpleSolutionWithoutBinarySearch(sampleArrayThree, sampleTargetThree));
        System.out.println(simpleSolutionWithoutBinarySearch(sampleArrayFour, sampleTargetFour));
        System.out.println(simpleSolutionWithoutBinarySearch(sampleArrayFive, sampleTargetFive));
    }
}
