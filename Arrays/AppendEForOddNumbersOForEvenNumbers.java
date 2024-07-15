package Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Append E for even numbers in the array and O for odd numbers in the 
 * array
 */

public class AppendEForOddNumbersOForEvenNumbers {

    public static void main(String[] args) {
        int setOfNumbers[] = new int[]{4,8,7,9,12,13,14};
        List<String>resultString = IntStream.of(setOfNumbers).mapToObj(number -> number%2 == 0 ? number+"E" : number+"O").collect(Collectors.toList());
        System.out.println("Result List :"+resultString);
    }
    
}
