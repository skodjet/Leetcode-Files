/* 876. Middle of the Linked List

Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Approach is to first cycle through the linked list, counting the number of nodes.
Then, determine where the middle of the linked list is by dividing the number of
nodes by 2 and adding 1. This works for both even and odd numbers of nodes, since
integer division cuts off the decimal point. After that, iterate through the linked list
until the middle is reached.

Time: O(N)
Extra Space: O(1) (ignoring space for the list nodes)
*/

public class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode currentNode = head;
        int numberOfNodes = 0;

        while(currentNode != null) { //Count the number of nodes in the linked list
            numberOfNodes++;
            currentNode = currentNode.next;
        }

        currentNode = head;
        int halfNodes = (numberOfNodes / 2) + 1;

        for(int i = 1; i < halfNodes; i++) {
            currentNode = currentNode.next;
        }

        return currentNode;

    }

    public static void main(String[] args) {
        Solution test = new Solution();

        ListNode five = new ListNode(5,null);
        ListNode four = new ListNode(4,five);
        ListNode three = new ListNode(3,four);
        ListNode two = new ListNode(2,three);
        ListNode head = new ListNode(1,two);

        System.out.println(test.middleNode(head));

    }
}
