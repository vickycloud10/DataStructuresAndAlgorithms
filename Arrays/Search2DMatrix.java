package Arrays;

/*
 * 
 * Search 2D Matrix:
 * 
 * Level : medium
 * 
 * You are given an m x n integer matrix matrix with the following two properties:
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise.
 * You must write a solution in O(log(m * n)) time complexity.
 * 
 * Example 1:
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * Output: true
 * 
 * Example 2:
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * Output: false
 * 
 * Constraints:
 * 
 * m == matrix.length
 * 
 * n == matrix[i].length
 * 
 * 1 <= m, n <= 100
 * 
 * -104 <= matrix[i][j], target <= 104
 * 
 */

public class Search2DMatrix {

    public static boolean binarySearch(int[][] matrix, int target) {

        int i = 0;

        while(i < matrix.length){

            int left = 0;
            int lengthOfColumnsInAParticularRow = matrix[i].length - 1;
    
            while(left <= lengthOfColumnsInAParticularRow && i < matrix.length){
                
                int mid = left + (lengthOfColumnsInAParticularRow - left)/2;
    
                if(matrix[i][mid] == target){
                    return true;
                }
    
                if(matrix[i][mid] > target){
                    lengthOfColumnsInAParticularRow = mid - 1;
                } else {
                    left = mid + 1;
                }
    
            }
    
            i++;
        }

        return false;

    }

    public static void main(String[] args) {
        int sampleMatrixOne [][] = {{1, 3, 5, 7},
                                    {10, 11, 16, 20}, 
                                    {23, 30, 34, 60}};
        int sampleTargetOne = 3;

        int sampleMatrixTwo [][] = {{1, 3, 5, 7},
                                    {10, 11, 16, 20}, 
                                    {23, 30, 34, 60}};
        int sampleTargetTwo = 13;

        System.out.println(binarySearch(sampleMatrixOne, sampleTargetOne));
        System.out.println(binarySearch(sampleMatrixTwo, sampleTargetTwo));

    }    
}
