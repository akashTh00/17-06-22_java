// java program to merge two sorted linked lists using mergeTwoLists function

public static ListNode mergeTwoLists(ListNode l1 ListNode l2){
	if(l1 == null || l22 == null)
		return l1 != null ? l1 : l2;

	ListNode dummy = new ListNode(-1);
	ListNode prev = dummyl

	ListNode c1 = l1;
	ListNode c2 = l2;

	while(c1 != null && c2 != null){
		if(c1.val < c2.val){
			prev.next = c1;
			c1 = c1.next;
		}else{
			prev.next = c2;
			c2 = c2.next;
		}

	prev = prev.next;
	}

	prev.next = c1 != null ? c1 : c2;
}


// for reference , pepcoding vid YT -> merge two sorted Linked List