/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode node = head;

        ListNode newNode = null;

        ListNode temp = null;

        while(node!=null){

            newNode = new ListNode(node.val);

            newNode.next = temp;

            temp = newNode;

            node = node.next;


        }


        return newNode;

        
        
    }
}
