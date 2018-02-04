public class ReverseLinkedList {
	
	public Node reverse(Node head){
		Node newNode = null;
		Node temp = null;
		while(head!=null){
			newNode = head.next;
			head.next = temp;
			temp = head;
			head = newNode;
		}
		return temp;
	}
	
	public Node reverseInGroupSize(Node head, int size){
		Node newNode = null;
		Node temp = null;
		Node current = head;
		int k=0;
		while(head!=null && k<size){
			newNode = head.next;
			head.next = temp;
			temp = head;
			head = newNode;
			k++;
		}
		if(newNode!=null){
			current.next = reverseInGroupSize(newNode, size);
		}
		return temp;
	}
	
	public void printList(Node head){
		while(head!=null){
			System.out.print(head.data);
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
	
		ReverseLinkedList list = new ReverseLinkedList();
		Node linkedList = new Node();
		Node head = linkedList.insert(3);
		head.next = linkedList.insert(5);
		head.next.next = linkedList.insert(7);
		head.next.next.next = linkedList.insert(8);
		list.printList(head);
		head = list.reverse(head);
		list.printList(head);
		head = list.reverseInGroupSize(head, 2);
		list.printList(head);
	}
	
}
