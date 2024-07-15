package Conversions;

public class DecimalToBinaryConversion {
    public static void main(String[] args) {
        int decimalValue = 25;
        int remainder = 0;
        StringBuffer stringBuffer = new StringBuffer();
        while(decimalValue != 0){
            remainder = decimalValue % 2;
            stringBuffer.append(remainder);
            decimalValue = decimalValue / 2;
        }
        System.out.println(stringBuffer.reverse().toString());
    }    
}
