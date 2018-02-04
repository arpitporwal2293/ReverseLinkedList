
public class Node {

	Node next;
	int data;
	
	public Node insert(int data){
		Node newNode = new Node();
		newNode.next = null;
		newNode.data = data;
		return newNode;
	}
	
}
