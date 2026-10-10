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
    public ListNode mergeNodes(ListNode head) {
        // Start traversing the linked list from the head
        ListNode temp = head;

        while(temp != null){

            // If current node is 0 and there is a next node
            if(temp.val == 0 && temp.next != null){

                int total = 0;

                // Add all node values until we reach the next 0
                while(temp.next != null && temp.next.val != 0){

                    // Add the current next node's value to total
                    total = total + temp.next.val;

                    // Remove the current next node from the linked list
                    temp.next = temp.next.next;
                }
                // Replace the current 0 with the calculated sum
                temp.val = total;

                 // If the next node is the last 0, remove it
                if (temp.next != null && temp.next.next == null) {
                    temp.next = null;
                }

            }
            // Move to the next node
            temp = temp.next;
        }
        // Return the modified linked list
        return head;
    }
}