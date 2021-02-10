package singly_linked_list;

import java.util.Scanner;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList singlyList = new SinglyLinkedList();
		singlyList.addFirst(10);
		singlyList.addFirst(20);
		singlyList.addFirst(60);
		singlyList.addFirst(70);
		System.out.println("The list we have:");
		singlyList.displayList();
		singlyList.addFirst(30);
		System.out.println("\nAdding element at first: ");
		singlyList.displayList();
		singlyList.addLast(40);
		System.out.println("\nAdding element at last: ");
		singlyList.displayList();
		singlyList.addAt(2, 50);
		System.out.println("\nAdding 50 at position 2: ");
		singlyList.displayList();
		System.out.println("\nRemoving first element from the list: ");
		singlyList.deleteFirstNode();
		singlyList.displayList();
		System.out.println("\nRemoving last element from the list: ");
		singlyList.deleteLastNode();
		singlyList.displayList();
		singlyList.deleteNode(20);
		System.out.println("\nRemoving 20 from the list: ");
		singlyList.displayList();
		singlyList.deleteNodeAt(4);
		singlyList.deleteNodeAt(2);
		System.out.println("\nRemoving element at position 2: ");
		singlyList.displayList();
		singlyList.displayReverse();
		System.out.println("\nList in reverse order: ");
		singlyList.displayList();
		System.out.print("\nPlease enter the element you are searhing for: ");
		int seachElement = sc.nextInt();
		int searchElementIndex = singlyList.searchElement(seachElement);
		if (searchElementIndex >= 0) {
			System.out.println(seachElement + " is present in index " + searchElementIndex);
		} else {
			System.out.println(seachElement + " is not present in the list");
		}
		System.out.println("Maximum value is the list: " + singlyList.maximumValue());
		System.out.println("Minimum value is the list: " + singlyList.minimumValue());
	}

}
