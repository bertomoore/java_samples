/*
    Write an algorithm to determine if a number is "happy".
    A happy number is a number defined by the following process:
    Starting with any positive integer, replace the number by the sum of the squares of its digits,
    and repeat the process until the number equals 1 (where it will stay),
    or it loops endlessly in a cycle which does not include 1.
    Those numbers for which this process ends in 1 are happy numbers.
*/

class Solution {
    private int sumOfDigitSquares(int n) {
        if (n == 0) {
            return 0;
        }
        int result = 0;
        while (n > 0) {
            result += Math.pow(n % 10, 2);
            n /= 10;
        }
        return result;
    }
    
    public boolean isHappy(int n) {
        int i = 0;
        while (i < 6) {
            n = sumOfDigitSquares(n);
            if (n == 1) {
                return true;
            }
            i += 1;
        }
        return false;
    }
}