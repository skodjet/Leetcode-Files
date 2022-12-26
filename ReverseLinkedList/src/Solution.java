/*206. Reverse Linked List.
* Given the head of a singly linked list, reverse the list, and return the reversed list.
* */

public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        ListNode previousNode = null;

        while(currentNode != null) {
            ListNode nextNode = currentNode.next; //Create a pointer for the next node.
            currentNode.next = previousNode; //Set the pointer for the current node to the previous node.
            previousNode = currentNode; //Increment the previous node
            currentNode = nextNode; //Increment the current node

            if(currentNode == null) return previousNode;


        }
        return currentNode;
    }


    public static void main(String[] args) {

        Solution test = new Solution();

        ListNode three = new ListNode(3,null);
        ListNode two = new ListNode(2,three);
        ListNode one = new ListNode(1,two);

        System.out.println(test.reverseList(one));
    }
}
