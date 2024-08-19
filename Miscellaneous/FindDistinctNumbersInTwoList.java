package Miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 
 * Find only the distinct numbers present in the two list
 * 
 * level : Easy
 * 
 */

public class FindDistinctNumbersInTwoList {

    private static List<Integer> findDistinctNumber(List<Integer> sampleListOne, List<Integer> sampleListTwo) {
        Set<Integer> resultSet = new HashSet<Integer>();

        for (int number : sampleListOne) {
            if(!sampleListTwo.contains(number)){
                resultSet.add(number);
            }
        }

        for (int number : sampleListTwo) {
            if(!sampleListOne.contains(number)){
                resultSet.add(number);
            }
        }

        return new ArrayList<>(resultSet);

    }
    public static void main(String[] args) {
        List<Integer> sampleListOne = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> sampleListTwo = Arrays.asList(2, 4, 5, 7);

        List<Integer> resultList =  findDistinctNumber(sampleListOne, sampleListTwo);

        for (int result : resultList) {
            System.out.print(result+" ");
        }

    }    
}
