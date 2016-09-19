/**
 * 2. Add Two Numbers
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
 
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 
public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode first = new ListNode(0);
        ListNode now = first;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int add = carry;
            if(l1 != null) {
                add += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                add += l2.val;
                l2 = l2.next;
            }

            if(add > 9) {
                add -= 10;
                carry = 1;
            }
            else
                carry = 0;

            now.next = new ListNode(add);
            now = now.next;
        }
        return first.next;
    }
}