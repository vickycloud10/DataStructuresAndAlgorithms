package Arrays;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindTheSecondLargestElementInTheList {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(5,3,1,2,6,4,7,9,8);

        listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
    }
    
}
