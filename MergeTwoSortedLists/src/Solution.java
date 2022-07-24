import java.util.List;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0); //Head of the eventual merged linked list.
        ListNode currentNode = temp;




        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) { //Take the smaller of the 2 values being compared and increment the list that the value was taken from.
                currentNode.next = list1;
                list1 = list1.next;
            }
            else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }

        if (list1 != null) {
                currentNode.next = list1;
            } else if (list2 != null) {
                    currentNode.next = list2;
            }


        return temp.next; //temp.next is the head of the merged linked list.
    }



    public static void main(String[] args) {
        Solution test = new Solution();
        //list1 nodes
        ListNode list13 = new ListNode(4);
        ListNode list12 = new ListNode(2,list13);
        ListNode list11 = new ListNode(1,list12);

        //list2 nodes
        ListNode list23 = new ListNode(4);
        ListNode list22 = new ListNode(3,list23);
        ListNode list21 = new ListNode(1,list22);


        System.out.println(test.mergeTwoLists(list11,list21));

    }
}
