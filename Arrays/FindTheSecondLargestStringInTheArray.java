package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheSecondLargestStringInTheArray {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Bat", "Bite", "Mango", "Person", "Kite", "fun", "time");
        Collections.sort(listOfStrings, Comparator.comparing(String::length).reversed());
        System.out.println("The second largest string of the given list is :");
        System.out.println(listOfStrings.get(1));
        System.out.println("The length of the second largest string of the given list is :"+listOfStrings.get(1).length());
        String secondLargestString = listOfStrings.stream().sorted(Comparator.comparingInt(String::length).reversed()).collect(Collectors.toList()).get(1);
        System.out.println("The second largest string of the given list using Streams is :");
        System.out.println(secondLargestString);
        System.out.println("The length of the second largest string of the given list is :"+secondLargestString.length());
    }
    
}
