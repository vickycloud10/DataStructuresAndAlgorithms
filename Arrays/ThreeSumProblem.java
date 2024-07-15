package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ThreeSumProblem {
    private static void sumOfThreeNumbers(int target, int[] sampleArray, int sizeOfTheArray){
        Arrays.sort(sampleArray);
        for(int i = 0; i < sampleArray.length - 2; i++){
            int left = i + 1;
            int right = sampleArray.length - 1;

            while(left < right){
                if(sampleArray[i] + sampleArray[left] + sampleArray[right] == target){
                    System.out.println("The sum of three numbers is :"+sampleArray[i] +" "+sampleArray[left]+" "+sampleArray[right]);
                    break;
                } else if(sampleArray[i] + sampleArray[left] + sampleArray[right] < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
    public static void main(String[] args) {
        int sampleArray[] = { 1, 4, 45, 6, 10, 8 };
        int target = 22;
        int sizeOfTheArray = sampleArray.length;

        sumOfThreeNumbers(target, sampleArray, sizeOfTheArray);
    }
}
