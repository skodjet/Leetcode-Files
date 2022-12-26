/*Linked List Cycle II
* Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
* There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
* followingthe next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is
* connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
*
*
* */

import java.util.HashMap;

public class Solution {

    public ListNode detectCycle(ListNode head) {
        /*HashMap<Integer,Integer> nodes = new HashMap<>();
        ListNode currentNode = head;
        int index = 0;
        int loopNodeIndex;


        while(currentNode != null) {
            if(nodes.containsKey(currentNode.val)) {
                loopNodeIndex = nodes.get(currentNode.val);
                currentNode = head;
                for(int i = 0; i < loopNodeIndex; i++) {
                    currentNode = currentNode.next;
                }
                return currentNode;
            }
            nodes.put(currentNode.val,index);
            currentNode = currentNode.next;
            index++;
        }


        return null;*/


        ListNode fast = head; //Moves 2 steps
        ListNode slow = head; //Moves 1 step

        ListNode intersection;



        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) { //Intersection found! A loop exists.
                intersection = slow;

                //Reset a pointer to the beginning and both nodes become "slow" now.
                slow = head;
                while(intersection != slow) {
                    slow = slow.next;
                    intersection = intersection.next;
                }
                return slow; //Return the point where the two pointers meet (start of the loop).
            }
        }


        return null; //No loop found (since there is no intersection).

    }

    public static void main(String[] args) {
        Solution test = new Solution();

        ListNode minusTwo = new ListNode(-2);
        ListNode minusFive = new ListNode(-5,minusTwo);
        ListNode minusNine = new ListNode(-9,minusFive);
        ListNode six = new ListNode(6,minusNine);
        ListNode nineteen = new ListNode(19,six);
        ListNode minusFour = new ListNode(-4,nineteen);
        ListNode seven = new ListNode(7,minusFour);
        ListNode minusSeven = new ListNode(-7,seven);
        ListNode minusOne = new ListNode(-1,minusSeven);
        minusTwo.next = minusFive;

        System.out.println(test.detectCycle(minusOne));


    }
}
