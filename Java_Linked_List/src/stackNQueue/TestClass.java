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
	}

}
