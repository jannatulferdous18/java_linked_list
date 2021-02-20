package stackNQueue;

public class LinkedList {
	Node head;

	public LinkedList() {
		head = null;
	}

	public Boolean isEmpty() {
		return ((head == null) ? true : false);
	}

	public void displayList() {
		Node currentNode = head;
		if (currentNode == null) {
			System.out.println("List is empty");
		} else {
			while (currentNode != null) {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			}
		}
		System.out.println();
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void removeFirst() {
		if (isEmpty()) {
			return;
		} else {
			if (head.next == null) {
				head = null;

			} else {
				head = head.next;
			}
		}
	}

	public int getSize() {
		int count = 0;
		if (isEmpty()) {
			return 0;
		} else {
			Node current = head;
			while (current != null) {
				count++;
				current = current.next;
			}
		}
		return count;
	}

}
