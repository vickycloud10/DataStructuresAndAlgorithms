package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindTheFirstNonRepeatingCharacterInAString {

    private static void findFirstUniqueCharacterInAStringUsingStreams(String sampleString){
        Map<String, Long>frequencyMap = Stream.of(sampleString.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        String result = frequencyMap.entrySet().stream().filter( e -> e.getValue() == 1).findFirst().map(Map.Entry::getKey).get();
        System.out.println("The first non repeating character of the above string "+sampleString+" is: \n"+result+"\n\n");
    }

    private static void findFirstUniqueCharacterInAStringWithoutUsingStreams(String sampleString){

        Map<Character, Integer> frequencyMap = new HashMap<>();
        char charArray[] = sampleString.toCharArray();

        for(int i = 0; i < charArray.length; i++){
            if(frequencyMap.containsKey(charArray[i])){
                frequencyMap.put(charArray[i], frequencyMap.get(charArray[i]) + 1);
            } else {
                frequencyMap.put(charArray[i], 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("The first non repeating character of the above string "+sampleString+" is: \n"+entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        String sampleString = "aabccdde";
        System.out.println("Finding first unique character of a given string using Streams api.\n");
        findFirstUniqueCharacterInAStringUsingStreams(sampleString);
        System.out.println("Finding first unique character of a given string without using Streams api.\n");
        findFirstUniqueCharacterInAStringWithoutUsingStreams(sampleString);
    }
}
