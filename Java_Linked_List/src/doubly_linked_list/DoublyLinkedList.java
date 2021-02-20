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

	public void removeFirstNode() {
		if (head == null) {
			return;
		} else {
			if (head.next == null) {
				head = null;
			} else {
				head.next.previous = null;
				head = head.next;
			}
		}
	}

	public void removeLastNode() {
		if (head == null) {
			return;
		} else {
			tail = head;
			if (head.next == null) {
				head = null;
			} else {
				while (tail.next != null) {
					tail = tail.next;
				}
				tail = tail.previous;
				tail.next = null;
			}
		}
	}

	public void removeAt(int position) {
		if (head == null) {
			return;
		} else if (position == 0) {
			removeFirstNode();
		} else if (position == getSizeList() - 1) {
			removeLastNode();
		} else if (position == getSizeList()) {
			System.out.print("\nThere is no element at this position");
			return;
		} else {
			tail = head;
			for (int i = 0; i < position; i++) {
				tail = tail.next;
			}
			tail.previous.next = tail.next;
			tail.next.previous = tail.previous;
			tail.previous.next = tail.next;
		}
	}

	public void removeElement(String data) {
		if (head == null) {
			return;
		} else {
			if (head.data.equals(data)) {
				removeFirstNode();
			} else if (!hasElement(data)) {
				System.out.print("\nGiven element is not present in the list");
			} else {
				tail = head;
				while (tail != null) {
					if (tail.next == null && tail.data.equals(data)) {
						removeLastNode();
					} else if (tail.data.equals(data)) {
						tail.previous.next = tail.next;
						tail.next.previous = tail.previous;
						tail.previous.next = tail.next;
					}
					tail = tail.next;
				}
			}
		}
	}

	public void removeBeforeElement(String beforeElement) {
		if (head == null) {
			return;
		} else if (head.data.equals(beforeElement)) {
			System.out.print("\nThere is no element before this to remove");
		} else if (head.next.data.equals(beforeElement)) {
			removeFirstNode();
		} else if (!hasElement(beforeElement)) {
			System.out.print("\nGiven element is not present in the list");
		} else {
			tail = head;
			while (tail.next != null) {
				if (tail.next.data.equals(beforeElement)) {
					tail.previous.next = tail.next;
					tail.previous = tail.next.previous;

				}
				tail = tail.next;
			}
		}
	}

	public void displayReversely() {
		Node previousNode = null;
		Node nextNode = null;
		if (head == null) {
			return;
		} else if (head.next == null) {
			return;
		} else {
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			head = currentNode;
			while (currentNode != null) {
				previousNode = currentNode.previous;
				currentNode.previous = currentNode.next;
				currentNode.next = previousNode;
				currentNode = previousNode;
			}

		}
	}

	public void sortedList() {
		int number_yes = 0;
		int number_ud = 0;
		if (head == null) {
			return;
		} else if (head.next == null) {
			return;
		} else {
			Node currentNode = head;
			while (currentNode != null) {
				if (!currentNode.equals(head)) {
					if (currentNode.data.contains("Yes")) {
						number_yes++;
						if (currentNode.next == null) {
							removeLastNode();
						} else {
							currentNode.previous.next = currentNode.next;
							currentNode.next.previous = currentNode.previous;
							currentNode.previous.next = currentNode.next;
						}
					} else if (currentNode.data.contains("UD")) {
						number_ud++;
						if (currentNode.next == null) {
							removeLastNode();
						} else {
							currentNode.previous.next = currentNode.next;
							currentNode.next.previous = currentNode.previous;
							currentNode.previous.next = currentNode.next;
						}
					}
				}
				currentNode = currentNode.next;
			}
			tail = head;
			if (tail != null) {
				for (int i = 1; i < number_yes; i++) {
					addFirst("Yes");
				}
				for (int i = 0; i < number_ud; i++) {
					addLast("UD");
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
