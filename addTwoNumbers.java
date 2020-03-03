/**
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order and each of their nodes contain a single digit.
    Add the two numbers and return it as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int sum = l1.val + l2.val;
        ListNode result = new ListNode(sum % 10);
        ListNode current = result;
        
        while (l1.next != null || l2.next != null) {
            
            sum /= 10;
            
            if (l1.next != null) {
                l1 = l1.next;
                sum += l1.val;
            }
            
            if (l2.next != null) {
                l2 = l2.next;
                sum += l2.val;
            }
            
            current.next = new ListNode(sum % 10);
            current = current.next;
            
        }
        
        if (sum > 9) {
            current.next = new ListNode(1);
        }
        
        return result;
        
    }
}