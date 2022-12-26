class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	ListNode currentNode1 = l1;
	ListNode currentNode2 = l2;
	ListNode returnListHead = new ListNode();
	ListNode currentReturnNode = returnListHead;
	int carryValue = 0;
	
	while(currentNode1 != null || currentNode2 != null) {
		if(currentNode1 == null) {
			ListNode zeroNode = new ListNode(0,null);
			currentNode1 = zeroNode;
		}
		if(currentNode2 == null) {
			ListNode zeroNode = new ListNode(0,null);
			currentNode2 = zeroNode;
		}


		if(currentNode1.val + currentNode2.val + carryValue < 10) {
			currentReturnNode.val = currentNode1.val + currentNode2.val + carryValue;
			carryValue = 0;
		} else {
			currentReturnNode.val = (currentNode1.val + currentNode2.val + carryValue) % 10;
			carryValue = (currentNode1.val + currentNode2.val + carryValue) / 10;
		}

		//Increment the return node
		if(currentNode1.next != null || currentNode2.next != null) {
			currentReturnNode.next = new ListNode();
			currentReturnNode = currentReturnNode.next;
		}

		//Increment each list
		currentNode1 = currentNode1.next;
		currentNode2 = currentNode2.next;
	}

	if(carryValue != 0) {
		currentReturnNode.next = new ListNode(carryValue,null);
	}

	return returnListHead;
        
    }

	public static void main(String[] args) {
		Solution test = new Solution();
		ListNode oneThree = new ListNode(9,null);
		ListNode oneTwo = new ListNode(9, oneThree);
		ListNode oneHead = new ListNode(9,oneTwo);

		//ListNode twoThree = new ListNode(4,null);
		ListNode twoTwo = new ListNode(9,null);
		ListNode twoHead = new ListNode(9,twoTwo);

		System.out.println(test.addTwoNumbers(oneHead,twoHead));

	}
}