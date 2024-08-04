package Strings;

import java.util.Stack;

/*
 * Valid Parantheses
 * 
 * Level : Easy
 * 
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * 
 * Example 1:
 * Input: s = "()"
 * Output: true
 * 
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * 
 * Example 3:
 * Input: s = "(]"
 * Output: false
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 * 
 */

public class ValidParantheses {

    public static boolean isValid(String s) {

        Stack<Character> storageStack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                storageStack.push(s.charAt(i));
            } else {
                if(storageStack.isEmpty()){
                    return false;
                } else {
                    int top = storageStack.peek();
                    if(s.charAt(i) == ')' && top == '(' || s.charAt(i) == '}' && top == '{' || s.charAt(i) == ']' && top == '['){
                        storageStack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return storageStack.isEmpty();
    }

    public static void main(String[] args) {
        String sampleInputOne = "()";
        String sampleInputTwo = "()[]{}";
        String sampleInputThree = "(]";

        System.out.println(isValid(sampleInputOne));
        System.out.println(isValid(sampleInputTwo));
        System.out.println(isValid(sampleInputThree));
    }   
}
