package doubly_linked_list;

import java.util.Scanner;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList doublyList = new DoublyLinkedList();
		doublyList.addFirst("No");
		doublyList.addFirst("Yes");
		doublyList.addLast("Yes");

		// doublyList.addAt(2, "UD");
		// doublyList.addElementAfter("Yes", "UD");

		doublyList.addLast("UD");
		doublyList.addLast("UD");
		doublyList.addLast("Yes");

		doublyList.addFirst("No");
		doublyList.addFirst("Yes");
		doublyList.addLast("Yes");
		doublyList.addLast("No");
		doublyList.addLast("Yes");
		doublyList.addLast("UD");
		// doublyList.addElementBefore("44", "25");
		// doublyList.removeFirstNode();
		// doublyList.removeLastNode();
		// doublyList.removeAt(2);
		// doublyList.removeBeforeElement("44");
		// doublyList.removeElement("2");
		doublyList.display();
		/*
		 * doublyList.displayReversely(); System.out.print("\nList in reverse: ");
		 * doublyList.display();
		 */
		doublyList.sortedList();
		System.out.print("\nSorted Linked list with string type elements: ");
		doublyList.display();
	}

}
