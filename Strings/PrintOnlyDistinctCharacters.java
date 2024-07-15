package Strings;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintOnlyDistinctCharacters {

    private static Map<Character, Integer> printDistinctCharactersWithoutUsingStreams(String sampleString) {
        Map<Character, Integer> resultMap = new HashMap<>();
        for(int i = 0; i < sampleString.length(); i++){
            if(resultMap.containsKey(sampleString.charAt(i))){
                resultMap.put(sampleString.charAt(i), resultMap.get(sampleString.charAt(i)) + 1);
            }else{
                resultMap.put(sampleString.charAt(i), 1);
            }
        }
        return resultMap;
    }

    public static void main(String[] args) {
        String simpleString = "VigneshwarBalaji";
        Map<Character, Long> resultMap = simpleString.toLowerCase().chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        resultMap.forEach((key, value) -> { if(value == 1) {System.out.println(key);} });
        // Map<Character, Long > result = Stream.of(simpleString.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //WithoutUsingStreams
        System.out.println("-----Distinct characters without using Streams-----");
        Map<Character, Integer> nonStreamResultMap = printDistinctCharactersWithoutUsingStreams(simpleString.toLowerCase());

        nonStreamResultMap.forEach((key,value) -> {if(value == 1) {System.out.println(key);}});

    }
    
}
