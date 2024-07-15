package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * 
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 * 
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * 
 * Example 3:
 * Input: nums = [1]
 * Output: 1
 * 
 */

public class SingleNumber {

    public static void findTheDistinctNumberInTheArrayUsingStreams(int [] arrayOfIntegers) {
        Map<Integer, Long>map = Arrays.stream(arrayOfIntegers).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((key, value) -> {if(value == 1){System.out.println(key);}});
    }

    public static int findTheDistinctNumberInTheArray(int [] arrayOfIntegers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i = 0; i < arrayOfIntegers.length; i++){
            if(frequencyMap.containsKey(arrayOfIntegers[i])){
                frequencyMap.put(arrayOfIntegers[i], frequencyMap.get(arrayOfIntegers[i]) + 1);
            } else {
                frequencyMap.put(arrayOfIntegers[i], 1);
            }
        }

        int result = 0;

        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(value == 1){
                result = key;
            }
        }
        return result;
    }

    private static int efficientWayOfFindingDistinctNumberInTheArray(int [] arrayOfIntegers) {

        if(arrayOfIntegers.length == 1){
            return arrayOfIntegers[0];
        }

        Arrays.sort(arrayOfIntegers);

        for(int i = 0; i < arrayOfIntegers.length - 1; i= i+2){
            if(arrayOfIntegers[i] != arrayOfIntegers[i + 1]){
                return arrayOfIntegers[i];
            }
        }
        System.gc();
        return arrayOfIntegers[arrayOfIntegers.length - 1];
    }

    public static void main(String[] args) {
        int [] arrayOfIntegers = {4,1,2,1,2};
        findTheDistinctNumberInTheArrayUsingStreams(arrayOfIntegers);
        System.out.println(findTheDistinctNumberInTheArray(arrayOfIntegers));
        System.out.println(efficientWayOfFindingDistinctNumberInTheArray(arrayOfIntegers));
    }
}
