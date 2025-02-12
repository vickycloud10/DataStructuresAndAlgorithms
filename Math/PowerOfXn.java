package Math;

/*
 * 
 * Calculate the power of x^n 
 * 
 * Level : Medium
 * 
 * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 * 
 * Example 1:
 * Input: x = 2.00000, n = 10
 * Output: 1024.00000
 * 
 * Example 2:
 * Input: x = 2.10000, n = 3
 * Output: 9.26100
 * 
 * Example 3:
 * Input: x = 2.00000, n = -2
 * Output: 0.25000
 * Explanation: 2-2 = 1/22 = 1/4 = 0.25
 * 
 * Constraints:
 * 
 * -100.0 < x < 100.0
 * 
 * -231 <= n <= 231-1
 * 
 * n is an integer.
 * 
 * Either x is not zero or n > 0.
 * 
 * -104 <= xn <= 104
 * 
 */


public class PowerOfXn {


    public static double myPow(double x, long n) {

        if(n == 0){
            return 1;
        }

        if(n < 0){
            return 1.0/(myPow(x, -n));
        }

        if (n % 2 == 1) {
            return x * myPow(x * x, (n - 1) / 2);
        } else {
            return myPow(x * x, n / 2);
        }

    }

    public static void main(String[] args) {
        System.out.println(myPow(2.0000, 10));
        System.out.println(myPow(2.10000, 3));
        System.out.println(myPow(2.00000, -2));
        System.out.println(myPow(1.00000, -2147483648));
    }
    
}
