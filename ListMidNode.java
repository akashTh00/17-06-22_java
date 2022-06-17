// Java program to print middle
// of a linked list

class ListNode{
	static Node head;

	 class Node
    {
        int data;
        Node next;
        Node(int d) 
        {
        	data = d; next = null; 
    	}
    }

	public void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

 /* Appends a new node at the end.*/

	public void append(int new_data){
		Node new_node = new Node(new_data);

		if(head == null){
			head = new Node(new_data);
			return;
		}

		new_node.next = null;

		Node last = head;
		while(last.next != null){
			last = last.next;
		}
		last.next = new_node;
		return;
	}

	void printList(Node head){
		Node tnode = head;
		while(tnode != null){
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
		System.out.println();
	}

	 public void insertAfter(Node prev_node, int new_data)
    {
        /* 1. Check if the given Node is null */
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
 
        /* 2 & 3: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;
 
        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;
    }

    public static Node middleNode(Node head){
    	Node slow = head, fast = head;
    	while (fast != null && fast.next != null) {
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	return slow;
    }

	public static void main(String[] args) {
		ListNode list = new ListNode();
		list.push(2);
		list.push(1);
		list.append(3);
		list.append(5);
		list.append(6);

		list.insertAfter(list.head.next.next, 4);

		System.out.print("Created Linked List is: ");
		list.printList(head);

		head = middleNode(head);
		System.out.print("Middle Node: ");
		list.printList(head);
	}
}