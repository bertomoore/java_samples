/*
    Given a string, your task is to count how many palindromic substrings in this string.
    The substrings with different start indexes or end indexes are counted as 
    different substrings even they consist of same characters.
*/

class Solution {
    
    private static int checkPalindromes(String str, int start, int end) {
        int count = 0;
        
        while (str.charAt(start) == str.charAt(end)) {
            
            count++;
            start--;
            end++;
            if (start < 0 || end == str.length()) break;
                
        }
        
        return count;
    }
    
    public int countSubstrings(String s) {
        
        int result = s.length();
        if (result == 1) return 1;
        
        for (int i=1; i < s.length() - 1; i++) {
            
            result += checkPalindromes(s, i-1, i);
            result += checkPalindromes(s, i-1, i+1);
            
        }
        
        if (s.charAt(s.length()-1) == s.charAt(s.length()-2)) result++;
            
        return result;
        
    }
}