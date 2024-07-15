package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortOddNumbersInAscendingOrderAndEvenNumbersInDescendingOrder {

    private static int[] TwoWaySort(int [] arrayOfIntegers) {
        List<Integer>evenNumbers = new ArrayList<>();
        List<Integer>oddNumbers = new ArrayList<>();

        for(int i = 0; i < arrayOfIntegers.length; i++){
            if(arrayOfIntegers[i] % 2 == 0){
                evenNumbers.add(arrayOfIntegers[i]);
            }else{
                oddNumbers.add(arrayOfIntegers[i]);
            }
        }

        Collections.sort(oddNumbers);
        Collections.sort(evenNumbers, Comparator.reverseOrder());
        
        int i = 0;

        for(int j = 0; j < oddNumbers.size(); j++){
            arrayOfIntegers[i] = oddNumbers.get(j);
            i++;
        }

        for(int j = 0; j < evenNumbers.size(); j++){
            arrayOfIntegers[i] = evenNumbers.get(j);
            i++;
        }
        return arrayOfIntegers;
    }

    private static void printTheGivenArray(int[] array){
        System.out.println("The sorted numbers are :");
        for(int number : array){
            System.out.print(number+" ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] sampleArray = {7,4,8,1,3,5,9,2,6};
        int[] secondSampleArray = {1, 3, 2, 7, 5, 4};
        int[] sortedArray = TwoWaySort(sampleArray);
        int[] sortedSeccondSampleArray = TwoWaySort(secondSampleArray);

        printTheGivenArray(sortedArray);
        printTheGivenArray(sortedSeccondSampleArray);
    }
}
