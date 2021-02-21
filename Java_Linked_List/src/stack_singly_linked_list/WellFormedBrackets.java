package stack_singly_linked_list;

public class WellFormedBrackets {
	LinkedList stackElement = new LinkedList();

	public void push(char data) {
		stackElement.addFirst(data);
	}

	public void pop() {
		stackElement.removeFirst();
	}

	public void printStack() {
		stackElement.displayList();
	}

	public char peek() {
		return (stackElement.head.data);
	}

	public int sizeStack() {
		return (stackElement.getSize());
	}

	public Boolean isWellFormed(String input) {
		if (input.charAt(0) == ')' || input.charAt(0) == ']') {
			return false;
		}
		for (int i = 0; i < input.length(); i++) {
			char charAt = input.charAt(i);
			if (charAt == '(' || charAt == '[') {
				push(charAt);
			} else if (charAt == ')') {
				char topChar = peek();
				if (topChar == '(') {
					pop();
				} else {
					return false;
				}
			} else if (charAt == ']') {
				char topChar = peek();
				if (topChar == '[') {
					pop();
				} else {
					return false;
				}
			}
		}

		if (sizeStack() == 0) {
			return true;
		}

		return false;
	}
}
