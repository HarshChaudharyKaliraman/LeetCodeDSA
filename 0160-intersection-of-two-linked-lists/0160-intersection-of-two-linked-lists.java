/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = null;
        while(headA!=null){
            temp=headB;
            while(temp!=null){
                if(temp==headA){
                    return headA;
                }
                temp=temp.next;
            }
            headA=headA.next;
        }
        return null;
    }
}