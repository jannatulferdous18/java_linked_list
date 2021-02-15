package doubly_linked_list;

public class DoublyLinkedList {

	Node head;
	Node tail;

	public DoublyLinkedList() {
		head = tail = null;
	}

	public void display() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			Node currentNode = head;
			while (currentNode != null) {
				// System.out.println(currentNode.toString());
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			}
		}
	}

	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			newNode.previous = null;
			newNode.next = null;
		} else {
			head.previous = newNode;
			newNode.next = head;
			head = newNode;
		}
	}

	public void addLast(String data) {
		Node newNode = new Node(data);
		tail = head;
		if (head == null) {
			head = newNode;
			newNode.previous = null;
			newNode.next = null;
		} else if (tail.next == null) {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
		} else {
			while (tail.next != null) {
				tail = tail.next;
			}
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
		}
	}

	public void addAt(int position, String data) {
		Node newNode = new Node(data);
		if (position == 0) {
			addFirst(data);
		} else if (position == getSizeList()) {
			addLast(data);
		} else {
			tail = head;
			for (int i = 1; i < position; i++) {
				tail = tail.next;
			}
			newNode.next = tail.next;
			tail.next.previous = newNode;
			tail.next = newNode;
			newNode.previous = tail;
		}
	}

	public Boolean hasElement(String searchElement) {
		tail = head;
		while (tail != null) {
			if (tail.data.equals(searchElement)) {
				return true;
			}
			tail = tail.next;
		}
		return false;
	}

	public void addElementAfter(String afterElement, String data) {
		Node newNode = new Node(data);
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else if (!hasElement(afterElement)) {
			System.out.println("Given element is not present in the list");
		} else {
			tail = head;
			while (tail != null) {
				if (tail.data.equals(afterElement)) {
					newNode.next = tail.next;
					tail.next.previous = newNode;
					tail.next = newNode;
					newNode.previous = tail;
				}
				tail = tail.next;
			}
		}
	}

	public void addElementBefore(String beforeElement, String data) {
		Node newNode = new Node(data);
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else if (!hasElement(beforeElement)) {
			System.out.println("Given element is not present in the list");
		} else {
			tail = head;
			while (tail != null) {
				if (tail.data.equals(beforeElement)) {
					tail.previous.next = newNode;
					newNode.previous = tail.previous;
					newNode.next = tail;
					tail.previous = newNode;
				}
				tail = tail.next;
			}
		}
	}

	public int getSizeList() {
		int count = 0;
		if (head == null) {
			return 0;
		} else {
			tail = head;
			while (tail != null) {
				count++;
				tail = tail.next;
			}
		}
		return count;
	}

}
