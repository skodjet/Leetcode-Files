/* 21. Merge Two Sorted Lists
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.



 */

public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list1Node = list1; //The current node from list1
        ListNode list2Node = list2; //The current node from list2


        ListNode head = new ListNode(); //A "dummy node" to act as the head of the spliced linked list.
        ListNode currentNode = head; //Pointer for the current node in the spliced linked list.

        while(list1Node != null && list2Node != null) {
            if(list1Node.val <= list2Node.val) { //Take from list1 and increment list1Node
                currentNode.next = list1Node;
                list1Node = list1Node.next;
            } else { //Take from list2 and increment list2Node
                currentNode.next = list2Node;
                list2Node = list2Node.next;
            }
            currentNode = currentNode.next; //Increment the current node regardless of which node is chosen.
        }

        if(list1Node != null) currentNode.next = list1Node;
        else if(list2Node != null) currentNode.next = list2Node;

        return head.next; //Return the head of the list, which is the node after the dummy node.
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        ListNode oneThree = new ListNode(4,null);
        //ListNode oneTwo = new ListNode(2,oneThree);
        //ListNode oneOne = new ListNode(1,oneTwo); //Head of list1

       // ListNode twoThree = new ListNode(4,null);
        //ListNode twoTwo = new ListNode(3,twoThree);
        //ListNode twoOne = new ListNode(1,twoTwo); //Head for list2

        ListNode testNode = new ListNode();

        System.out.println(test.mergeTwoLists(oneThree,testNode));

    }
}
