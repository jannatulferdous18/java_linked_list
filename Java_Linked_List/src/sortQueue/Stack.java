package sortQueue;

public class Stack {
	LinkedList stackElement = new LinkedList();

	public void push(int data) {
		stackElement.addFirst(data);
	}

	public void pop() {
		stackElement.removeFirst();
	}

	public void printStack() {
		stackElement.displayList();
	}

	public int peek() {
		return (stackElement.head.data);
	}

	public Boolean isEmpty() {
		return ((sizeStack() == 0) ? true : false);
	}

	public int sizeStack() {
		return (stackElement.getSize());
	}
}
