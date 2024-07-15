package Math;

/*
 * 
 * Given an integer x, return true if x is a 
 * palindrome
 * , and false otherwise.
 * 
 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * 
 * 
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * 
 * 
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * 
 * 
 * 
 */

public class Palindrome {
    private static boolean isPalindrome(int number) {
        
        if(number < 0){
            return false;
        }

        int reversedNumber = 0;
        int reminder = 0;
        int temporaryVariable = number;

        while(temporaryVariable > 0){
            reminder = temporaryVariable % 10;
            reversedNumber = reversedNumber*10 + reminder;
            temporaryVariable = temporaryVariable/ 10;
        }
        return reversedNumber == number;
    }
    public static void main(String[] args) {
        int [] arrayOfIntegers = {121, 1, -121, 343, 222434222, 10, 101, 252, 24};

        for(int number : arrayOfIntegers){
            System.out.println("\n"+number +" is this number a palindrome -->"+isPalindrome(number));
        }
    }    
}
