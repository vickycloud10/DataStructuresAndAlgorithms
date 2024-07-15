package Math;

public class ReverseAnInteger {

    private static int reverseInteger(int x) {

        long temporaryVariable = x < 0 ? x * -1: x;
        long reminder = 0;
        long reversedInteger = 0;

        while(temporaryVariable > 0){
            reminder = temporaryVariable % 10;
            reversedInteger = reversedInteger * 10 + reminder;
            temporaryVariable = temporaryVariable / 10;
        }

        if(reversedInteger > Integer.MAX_VALUE || reversedInteger < Integer.MIN_VALUE){
            return 0;
        }

        if(x < 0){
            return (int)reversedInteger * -1;
        }

        return (int)reversedInteger;
    }
    public static void main(String[] args) {
        System.out.println(reverseInteger(-231));
        System.out.println(reverseInteger(231));
        System.out.println(reverseInteger(1534236469));
        System.out.println(reverseInteger(-1563847412));
    }
}
