package DataStructure.LinkLists.SinglyLinkList;

public class ReverseLinkedList {
	static Node head;
public static void main(String args[]) {
	head = new Node(1);
	head.next = new Node(2);
	head.next.next = new Node (3);
	head.next.next.next = new Node (4);
	head.next.next.next.next = new Node (5);
	head .next.next.next.next.next = null;
    print(head);
    System.out.println();
    reverse();
    print(head);

}

public static void reverse() {
	Node nextNode =null, previous = null , currentNode = head;
    while(currentNode!=null) {
    	 nextNode=currentNode.next;
         currentNode.next = previous;
         previous = currentNode;
         currentNode = nextNode;
    }
    head =previous;
}

public static void print(Node head) {
	while(head!=null) {
		System.out.print(head.data +" ");
		head = head.next;
	}
}
}
