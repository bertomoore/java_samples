/*
    Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Note that an empty string is also considered valid.
*/

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        
        Map<Character, Character> pairs = new HashMap<Character, Character>();
        pairs.put(')','(');
        pairs.put('}','{');
        pairs.put(']','[');
        
        Stack st = new Stack();
        
        for (char ch : s.toCharArray()) {
            
            if (pairs.containsKey(ch)) {
                try {
                    assert st.pop() == pairs.get(ch);
                    
                } catch (EmptyStackException e) {
                    return false;
                    
                } catch (AssertionError e) {
                    return false;
                    
                }
            } else {
                st.push(ch);
            }
        }
        
        return st.empty();
    }
}