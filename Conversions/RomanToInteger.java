package Conversions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/*
 * 
 * Roman number to integer conversion:
 * 
 * Roman numerals are represented by seven different symbols 
 * Symbol ------ Value
 * 1      ------ I
 * 5      ------ V
 * 10     ------ X
 * 50     ------ L
 * 100    ------ C
 * 500    ------ D
 * 1000   ------ M
 * 
 */

public class RomanToInteger {

    private static int convertRomanNumeralsToIntegerSecondMethod(String romanNumeral) {
        
        int number = 0;
        int previous = 0;
        int answer = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            switch (romanNumeral.charAt(i)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }

            if(number < previous){
                answer -= number;
            } else {
                answer += number;
            }
            previous = number;
        }
        return answer;
    }

    private static int convertRomanToInteger(String romanNumeral) {

        Map<Character, Integer> romanToIntegerConversionMap = new HashMap<>();
        romanToIntegerConversionMap.put('I', 1);
        romanToIntegerConversionMap.put('V', 5);
        romanToIntegerConversionMap.put('X', 10);
        romanToIntegerConversionMap.put('L', 50);
        romanToIntegerConversionMap.put('C', 100);
        romanToIntegerConversionMap.put('D', 500);
        romanToIntegerConversionMap.put('M', 1000);

        int answer = 0;

        for (int i = 0; i < romanNumeral.length(); i++) {
            if(i < romanNumeral.length() - 1 && romanToIntegerConversionMap.get(romanNumeral.charAt(i)) < romanToIntegerConversionMap.get(romanNumeral.charAt(i + 1))){
                answer -= romanToIntegerConversionMap.get(romanNumeral.charAt(i));
            } else {
                answer += romanToIntegerConversionMap.get(romanNumeral.charAt(i));
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        String []arrayOfRomanNumeralInputs = {"XXV","XXIX","XXXIX","MDLXX","CL","CCC","MD",
                                              "MMM","IX","XIX","CXC","CCXC","CDXC","CDLXX","MMMCM",
                                              "MML","MMMXL","CDL","MCM", "DC","CMXC","MMCML","MMCDX",
                                              "CD","X","D","M","L","C","V","I", "XXIV","XLVII", "IV"};

        //First method of conversion consumes o(n) space
        System.out.println("\n\n\nfirst method of conversion from Roman numerals to integer");
        Stream.of(arrayOfRomanNumeralInputs).forEach(romanNumeral -> {System.out.print(convertRomanToInteger(romanNumeral)+", ");});
        //second method of conversion has good time and space complexity
        System.out.println("\n\n\nSecond method of conversion from Roman numerals to integer");
        Stream.of(arrayOfRomanNumeralInputs).forEach(romanNumeral -> {System.out.print(convertRomanNumeralsToIntegerSecondMethod(romanNumeral)+", ");});

    }
    
}
