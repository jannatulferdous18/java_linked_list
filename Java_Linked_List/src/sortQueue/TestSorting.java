package sortQueue;

public class TestSorting {

	public static void main(String[] args) {
		int numberOfElements = 5;
		takeInputs inputs = new takeInputs(numberOfElements);
		System.out.print("The elements in Queue: ");
		inputs.q1.printQueue();
		inputs.sortStack();
		System.out.print("Elements in the stack in sorted order: ");
		inputs.s1.printStack();
	}

}
