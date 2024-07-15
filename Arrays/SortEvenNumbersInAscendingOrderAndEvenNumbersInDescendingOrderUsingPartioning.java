package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortEvenNumbersInAscendingOrderAndEvenNumbersInDescendingOrderUsingPartioning {
    
    private static Integer[] twoWaySort(Integer numberArray[]){
        int left = 0;
        int right = numberArray.length - 1;
        int k = 0;

        while(left < right){
            while(numberArray[left] % 2 != 0){
                left++;
                k++;
            }

            while(numberArray[right] % 2 == 0 && left < right){
                right--;
            }

            if(left < right){
                int temp = numberArray[left];
                numberArray[left] = numberArray[right];
                numberArray[right] = temp;
            }
        }

        Arrays.sort(numberArray, 0, k, Collections.reverseOrder()); 
        Arrays.sort(numberArray, k, numberArray.length - 1);

        return numberArray;
    }

    private static void printTheGivenArray(Integer[] array){
        System.out.println("The sorted numbers are :");
        for(int number : array){
            System.out.print(number+" ");
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        Integer [] sampleArray = {1, 2, 3, 5, 4, 7, 10};
        twoWaySort(sampleArray);
        printTheGivenArray(sampleArray);
    }
}
