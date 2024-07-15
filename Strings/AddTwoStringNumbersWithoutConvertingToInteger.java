package Strings;

public class AddTwoStringNumbersWithoutConvertingToInteger {
    public static void main(String[] args) {
        String sampleNumberOne = "545";
        String sampleNumberTwo = "435";

        int pointerForSampleNumberOne = sampleNumberOne.length() - 1;
        int pointerForSampleNumberTwo = sampleNumberTwo.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while(pointerForSampleNumberOne >= 0 || pointerForSampleNumberTwo >= 0){
            int sum = carry;
            if(pointerForSampleNumberOne >= 0){
                sum += sampleNumberOne.charAt(pointerForSampleNumberOne--) -'0';
            }

            if(pointerForSampleNumberTwo >= 0){
                sum += sampleNumberTwo.charAt(pointerForSampleNumberTwo--) -'0';
            }

            result.append(sum % 10);
            carry = sum/10;
        }

        System.out.println(result.reverse().toString());
    }
}
