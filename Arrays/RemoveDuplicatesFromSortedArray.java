package Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        
        if (nums.length == 0) return 0;
        
        int j = 1; 
        int count = 1; 
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            
            if (count <= 2) {
                nums[j++] = nums[i];
            }
        }
        
        return j;
    }

    public static void main(String[] args) {
        int [] sampleArray = {0,0,1,1,1,2,2,3,3,3};
        System.out.println(removeDuplicates(sampleArray));
        int [] secondSampleArray = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(secondSampleArray));
    }
}
