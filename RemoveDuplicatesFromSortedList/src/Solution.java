public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;
        while(currentNode != null && currentNode.next != null) {
            if(currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            } else {
            currentNode = currentNode.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode last = new ListNode(2,null);
        ListNode second = new ListNode(1,last);
        ListNode first = new ListNode(1,second);

        Solution test = new Solution();
        System.out.println(test.deleteDuplicates(first));
    }
}
