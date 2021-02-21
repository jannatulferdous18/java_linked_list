package stackNQueue;

public class Queue {
	LinkedList queueElement = new LinkedList();

	public void enqueue(int data) {
		queueElement.addFirst(data);
	}

	public void dequeue() {
		queueElement.removeLast();
	}

	public void printQueue() {
		queueElement.displayList();
	}

	public int sizeQueue() {
		return (queueElement.getSize());
	}
}
