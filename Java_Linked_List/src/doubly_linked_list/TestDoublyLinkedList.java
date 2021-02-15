package doubly_linked_list;

import java.util.Scanner;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList doublyList = new DoublyLinkedList();
		doublyList.addFirst("10");
		doublyList.addFirst("20");
		doublyList.addLast("30");
		doublyList.addAt(2, "44");
		doublyList.addElementAfter("44", "40");
		doublyList.addElementBefore("44", "25");
		doublyList.display();
	}

}
