package Strings;

/*
 * 
 * Valid Palindrome:
 * 
 * Level : Easy
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * 
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * 
 *  Example 3:
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 2 * 105
 * 
 * s consists only of printable ASCII characters.
 * 
 */

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String specialCharacterRemovedString  = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = specialCharacterRemovedString.length() - 1;

        if(specialCharacterRemovedString.length() == 0){
            return false;
        }

        while(left <= right){

            if(specialCharacterRemovedString.charAt(right) == specialCharacterRemovedString.charAt(left)){
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String sampleStringOne = "A man, a plan, a canal: Panama";
        String sampleStringTwo = "race a car";
        String sampleStringThree = " ";
        
        System.out.println(isPalindrome(sampleStringOne));
        System.out.println(isPalindrome(sampleStringTwo));
        System.out.println(isPalindrome(sampleStringThree));

    }    
}
