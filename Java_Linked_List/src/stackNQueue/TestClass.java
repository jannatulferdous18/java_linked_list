package stackNQueue;

public class TestClass {

	public static void main(String[] args) {
		Stack s1 = new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(60);

		System.out.print("Elements in the stack: ");
		s1.printStack();
		s1.pop();
		System.out.print("Elements in the stack after popping: ");
		s1.printStack();
		System.out.println("Peek element in the stack: " + s1.peek());
		System.out.println("Size of the stack: " + s1.sizeStack());

		Queue q1 = new Queue();
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		q1.enqueue(50);
		q1.enqueue(60);

		System.out.print("Elements in the queue: ");
		q1.printQueue();
		q1.dequeue();
		System.out.print("Elements in the queue after dequeuing: ");
		q1.printQueue();
		System.out.println("Front element in the queue: " + q1.front());
		System.out.println("Size of the queue: " + q1.sizeQueue());
	}

}
