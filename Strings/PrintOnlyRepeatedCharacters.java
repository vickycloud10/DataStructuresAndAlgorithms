package Strings;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintOnlyRepeatedCharacters {

    private static Map<Character, Integer> getNonDistinctCharactersWithoutUsingStreams(String sampleString) {
        Map<Character, Integer>resultMap = new HashMap<>();
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
        String simpleString = "MightyMinds";
        Map<Character, Long> repeatedMap = simpleString
                                           .toLowerCase()
                                           .chars()
                                           .mapToObj(character ->(char) character)
                                           .collect(Collectors.groupingBy(character -> character,Collectors.counting()));

        System.out.println("The repeated characters in this string using streams are : ");
        repeatedMap.forEach((key, value ) -> {
            if(value > 1){
                System.out.print(key+"----"+value+"\n");
            }
        });
        System.out.println("The repeated characters in this string without using streams are : ");
        Map<Character, Integer>repeatedCharacterMap = getNonDistinctCharactersWithoutUsingStreams(simpleString.toLowerCase());
        repeatedCharacterMap.forEach((key, value ) -> {
            if(value > 1){
                System.out.print(key+"----"+value+"\n");
            }
        });
    }
    
}