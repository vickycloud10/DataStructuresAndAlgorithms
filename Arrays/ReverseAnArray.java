package Arrays;
import java.util.stream.IntStream;

public class ReverseAnArray {
    public static void main(String[] args) {
        int sampleArray[] = {9,8,7,6,5,4,3,2,1,0};
        int reversedArray[] = IntStream.rangeClosed(1, sampleArray.length)
                              .map(arrayNumber -> sampleArray[sampleArray.length - arrayNumber])
                              .toArray();

        for(int number: reversedArray){
            System.out.print(number+" ");
        }
    }    
}
