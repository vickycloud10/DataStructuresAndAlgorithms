package Strings;

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
