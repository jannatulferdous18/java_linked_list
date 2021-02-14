package singly_linked_list;

public class SinglyLinkedList {

	Node head;
	Node tail;

	public SinglyLinkedList() {
		head = null;
		tail = null;
	}

	public Boolean isEmpty() {
		// return (head==null);
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

	public void addFirst(int data) {

		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
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

	public void addAt(int position, int data) {
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

	public void deleteFirstNode() {
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

	public void deleteLastNode() {
		if (isEmpty()) {
			return;
		} else {
			tail = head;
			if (tail.next == null) {
				head = tail = null;

			} else {
				while (tail.next.next != null) {
					tail = tail.next;
				}
				tail.next = null;
			}
		}
	}

	public void deleteNode(int data) {
		if (isEmpty()) {
			return;
		} else {
			tail = head;
			while (tail.next.data != data) {
				tail = tail.next;
			}
			tail.next = tail.next.next;
		}
	}

	public void deleteNodeAt(int position) {
		if (isEmpty()) {
			return;
		} else {
			if (position == 0) {
				deleteFirstNode();
			} else if (position >= getSizeList()) {
				System.out.print("\nThere is no element at this position");
				return;
			} else {
				Node currentNode = head;
				for (int i = 0; i < position - 1; i++) {
					currentNode = currentNode.next;
				}
				currentNode.next = currentNode.next.next;
			}
		}
	}

	public Node listReverse() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node previousNode = null;
			Node nextNode = null;
			Node currentNode = head;
			while (currentNode != null) {
				nextNode = currentNode.next;
				currentNode.next = previousNode;
				previousNode = currentNode;
				currentNode = nextNode;
			}
			head = previousNode;
		}
		return head;
	}

	public int searchElement(int element) {
		int positionInList = -1;
		if (isEmpty()) {
			return -1;
		} else {
			Node currentNode = head;
			while (currentNode != null) {
				positionInList++;
				if (currentNode.data == element) {
					// if (currentNode.data.equals(element)) {
					return positionInList;
				}
				currentNode = currentNode.next;
			}
		}
		return -1;
	}

	public int maximumValue() {
		Node currentNode = head;
		int maxValue = head.data;
		tail = head;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			while (currentNode != null) {
				if (maxValue < currentNode.data) {
					maxValue = currentNode.data;
				}
				currentNode = currentNode.next;
			}

		}
		return maxValue;
	}

	public int minimumValue() {
		Node currentNode = head;
		int minValue = head.data;
		tail = head;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			while (currentNode != null) {
				if (minValue > currentNode.data) {
					minValue = currentNode.data;
				}
				currentNode = currentNode.next;
			}

		}
		return minValue;
	}

	public Boolean isPalindrome() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node currentNode = head;
			Node listReverse = listReverse();
			while (currentNode != null && listReverse != null) {
				if (currentNode.data != listReverse.data) {
					return false;
				}
				currentNode = currentNode.next;
				listReverse = listReverse.next;
			}
		}
		return true;
	}

	public void removeDuplicate() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node currentNode = head;
			while (currentNode != null) {
				Node temp = currentNode;
				Node index = currentNode.next;
				while (index != null) {
					if (currentNode.data == index.data) {
						temp.next = index.next;
					} else {
						temp = index;
					}
					index = index.next;
				}
				currentNode = currentNode.next;
			}
		}
	}

	public void sortAscend() {
		if (isEmpty()) {
			return;
		} else {
			Node currentNode = head;
			while (currentNode != null) {
				Node index = currentNode.next;
				while (index != null) {
					if (currentNode.data > index.data) {
						int temp = currentNode.data;
						currentNode.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				currentNode = currentNode.next;
			}
		}
	}

	public void sortDescend() {
		if (isEmpty()) {
			return;
		} else {
			Node currentNode = head;
			while (currentNode != null) {
				Node index = currentNode.next;
				while (index != null) {
					if (currentNode.data < index.data) {
						int temp = currentNode.data;
						currentNode.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				currentNode = currentNode.next;
			}
		}
	}

	public void sortedInsert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			System.out.println("List is empty");
		} else if (head.next == null) {
			if (head.data > newNode.data) {
				addFirst(data);
			} else {
				addLast(data);
			}
		} else {
			Node currentNode = head;
			while (currentNode != null) {
				if (head.data > newNode.data) {
					addFirst(data);
				} else if (currentNode.data < newNode.data && currentNode.next == null) {
					currentNode.next = newNode;
				} else if (currentNode.data < newNode.data && currentNode.next.data > newNode.data) {
					newNode.next = currentNode.next;
					currentNode.next = newNode;
					break;
				}
				currentNode = currentNode.next;
			}

		}
	}

	public int getSizeList() {
		int count = 0;
		if (isEmpty()) {
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
