package Strings;

/*
 * 
 * Reverse A String
 * 
 * Level: Easy
 * 
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * 
 * Example 1:
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * 
 * Example 2:
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 105
 * 
 * s[i] is a printable ascii character.
 * 
 */

public class ReverseAString {

    public static void reverseString(char [] sampleStringOne) {
        int i = 0;
        int j = sampleStringOne.length - 1;

        while(i <= j){
            char temp = sampleStringOne[i];
            sampleStringOne[i] = sampleStringOne[j];
            sampleStringOne[j] = temp;
            i++;
            j--;
        }

        for (char c : sampleStringOne) {
            System.out.print(c+" ");
        }
    }
    public static void main(String[] args) {
        char sampleStringOne[] = {'h','e','l','l','o'};
        reverseString(sampleStringOne); 
    }    
}
