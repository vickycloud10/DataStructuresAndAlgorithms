package Math;

/*
 *
 * Search for a given number in an array and return the index of the array
 * where the element is placed
 * 
 */

public class SearchAGivenNumberInAnIntegerArray {

    private static int iterativeBinarySearch(int [] array, int left, int right, int x) {
        while(left <= right){
            int mid = left + (right - left)/2;

            if(array[mid] == x){
                return mid;
            }

            if(array[mid] < x){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private static int binarySearch(int [] array, int left, int right, int x) {
        
        if(right >= left){
            int mid = left + (right - left)/2;

            if(array[mid] == x){
                return mid;
            }

            if(array[mid] > x)
                return binarySearch(array, left, mid - 1, x);

            return binarySearch(array, mid + 1, right, x);
        }
        return -1;
    }
    public static void main(String[] args) {
        int sampleArray [] = {2,4,7,8,9,12,14,17,20,27,28};
        int n = sampleArray.length;
        int indexOfSearchedNumber = binarySearch(sampleArray, 0, n - 1, 14);
        System.out.println("The index of the given number is : "+indexOfSearchedNumber);

        int indexOfSearchedNumberInIterative = iterativeBinarySearch(sampleArray, 0, n - 1, 14);
        System.out.println("The index of the given number is : "+indexOfSearchedNumberInIterative);
    }
}
