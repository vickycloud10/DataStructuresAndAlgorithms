package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * Problem :
 * Add Two Sum: 
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 * Level : Medium
 * 
 * Example: 
 * 2 --> 4 --> 3
 * 5 --> 6 --> 4
 * 
 * Answer: 
 * 
 * 7 --> 0 --> 8
 * 
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * 
 * Example 2:
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 */

public class AddTwoNumbers {

    private static List<Integer> reverseTheLinkedList(List<Integer>list){
        List<Integer>reversedList = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while(iterator.hasPrevious()){
            reversedList.add(iterator.previous());
        }

        return reversedList;
    }

    private static List<Integer> addNumbersInLinkedList(List<Integer>sampleListOne,List<Integer>sampleListTwo){
        List<Integer>result = new LinkedList<>();
        ListIterator<Integer> listIteratorOne = sampleListOne.listIterator();
        ListIterator<Integer> listIteratorTwo = sampleListTwo.listIterator();
        int carry = 0;

        while(listIteratorOne.hasNext() || listIteratorTwo.hasNext() || carry != 0){
            int sum = carry;
            if(listIteratorOne.hasNext()){
                sum += listIteratorOne.next();
            }
            if(listIteratorTwo.hasNext()){
                sum += listIteratorTwo.next();
            }
            result.add(sum%10);
            carry = sum/10;
        }

        return result;
        
    }

    public static void main(String[] args) {
        List<Integer> sampleListOne = new LinkedList<>(Arrays.asList(2,4,3));
        List<Integer> sampleListTwo = new LinkedList<>(Arrays.asList(5,6,4));

        List<Integer>reversedSampleListOne = reverseTheLinkedList(sampleListOne);
        List<Integer>reversedSampleListTwo = reverseTheLinkedList(sampleListTwo);

        List<Integer>result = reverseTheLinkedList(addNumbersInLinkedList(reversedSampleListOne, reversedSampleListTwo));

        System.out.println("The addition of two list is :");
        for(Integer x : result){
            System.out.print(x+" ");
        }
    }
}
