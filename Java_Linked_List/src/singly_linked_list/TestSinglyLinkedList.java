package singly_linked_list;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList singlyList = new SinglyLinkedList();
		singlyList.addFirst("10");
		singlyList.addFirst("20");
		System.out.println("The list we have:");
		singlyList.displayList();
		singlyList.addFirst("30");
		System.out.println("\nAdding element at first: ");
		singlyList.displayList();
		singlyList.addLast("40");
		System.out.println("\nAdding element at last: ");
		singlyList.displayList();
		singlyList.addAt(2, "50");
		System.out.println("\nAdding element at position two: ");
		singlyList.displayList();
	}

}
