package Strings;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Write a program to count the number of characters in a word
 */

public class CountTheNumberOfCharacterInAWord {
    public static void main(String[] args) {
        String simpleString = "ParallelWorld";
        String result = Stream.of(simpleString.toLowerCase().split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).toString();
        System.out.println("Number of characters in the string : "+result);
        List<String> listOfFruits = Arrays.asList("apple", "papaya", "strawberry", "mango", "apple", "kiwi", "papaya", "apple", "fig", "mango");
        String numberOfEachFruits = listOfFruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).toString();
        System.out.println("Number of each fruits :"+numberOfEachFruits);
    }
}
