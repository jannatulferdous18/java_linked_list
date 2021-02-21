package stack_singly_linked_list;

public class Node {

	char data;
	Node next;

	public Node(char data) {
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
}
