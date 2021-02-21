package stack_singly_linked_list;

public class TestBrackets {

	public static void main(String[] args) {

		String input = "()[)))))))]";
		WellFormedBrackets w1 = new WellFormedBrackets();
		w1.isWellFormed(input);
		Boolean isWellFormed = w1.isWellFormed(input);
		if (isWellFormed) {
			System.out.println("Well formed expression");
		} else {
			System.out.println("Mal formed expression");
		}
	}

}
