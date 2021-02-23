package sortQueue;

import java.util.Random;

public class takeInputs {

	Stack s1 = new Stack();
	Queue q1 = new Queue();

	public takeInputs(int numberData) {
		Random rd = new Random();
		for (int i = 0; i < numberData; i++) {
			q1.enqueue(rd.nextInt());
		}
	}

	public int findMaxValue() {
		int max = q1.front();
		for (int i = 0; i < q1.sizeQueue(); i++) {
			if (max < q1.front()) {
				max = q1.front();
			}
			q1.enqueue(q1.front());
			q1.dequeue();
		}
		return max;
	}

	void printStack() {
		if (s1.isEmpty()) {
			return;
		}

		while (!s1.isEmpty()) {
			System.out.println(s1.peek());
			s1.pop();

		}

	}

	public void sortStack() {
		int maximumValue = findMaxValue();
		for (int i = 0; i < q1.sizeQueue(); i++) {
			if (q1.front() != maximumValue) {
				q1.enqueue(q1.front());
				q1.dequeue();
			} else {
				s1.push(maximumValue);

				q1.dequeue();
			}
		}
		while (!q1.isEmpty()) {
			if (q1.front() <= s1.peek()) {
				s1.push(q1.front());
				q1.dequeue();
			} else if (q1.front() > s1.peek()) {
				q1.enqueue(s1.peek());
				s1.pop();
			}
		}

	}
}