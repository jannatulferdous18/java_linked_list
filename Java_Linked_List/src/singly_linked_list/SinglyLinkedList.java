package singly_linked_list;

public class SinglyLinkedList {

	Node head;
	Node tail;

	public SinglyLinkedList() {
		head = null;
		tail = null;
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
				// 2nd way to display elements
				// currentNode.toString();
				currentNode = currentNode.next;
			}
		}
	}

	public void addFirst(String data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;

		} else {
			tail = head;
			while (tail.next != null) {
				tail = tail.next;
			}
			tail.next = newNode;
		}
	}

	public void addAt(int position, String data) {
		Node newNode = new Node(data);
		if (position == 0) {
			addFirst(data);

		} else {
			tail = head;
			for (int i = 1; i < position; i++) {
				tail = tail.next;
			}
			newNode.next = tail.next;
			tail.next = newNode;
		}
	}

}
