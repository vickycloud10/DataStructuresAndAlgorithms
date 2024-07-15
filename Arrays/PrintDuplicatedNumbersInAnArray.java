package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicatedNumbersInAnArray {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(5,3,3,1,2,1,1,7,7);
        Map<Integer, Long> frequencyMapOfIntegers = listOfIntegers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("The duplicated values of the array are : ");
        frequencyMapOfIntegers.forEach((key, value) -> {
            if(value > 1){
                System.out.print(key+" ");
            }
        });
    }
    
}
