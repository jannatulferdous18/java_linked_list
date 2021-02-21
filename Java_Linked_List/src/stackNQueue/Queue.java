package stackNQueue;

public class Queue {
	LinkedList queueElement = new LinkedList();

	public void enqueue(int data) {
		queueElement.addLast(data);
	}

	public void dequeue() {
		queueElement.removeFirst();
	}

	public void printQueue() {
		queueElement.displayList();
	}

	public int sizeQueue() {
		return (queueElement.getSize());
	}

	public int front() {
		return (queueElement.head.data);
	}
}
