/*
    Write a function that takes an unsigned integer and return 
    the number of '1' bits it has (also known as the Hamming weight).
    Note: Do not use built-in methods like Integer.bitCount()
*/

public class Solution {

    public int hammingWeight(int n) {

        int c = 0;
        boolean negative = n < 0;
        if (negative) n = (n + 1) * -1;

        while (n > 0) {
            c += n % 2;
            n /= 2;
        }

        return negative ? 32 - c : c;
    }

}