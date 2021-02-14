package singly_linked_list;

import java.util.Scanner;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList singlyList = new SinglyLinkedList();
		singlyList.addFirst(10);
		singlyList.addFirst(20);
		singlyList.addFirst(70);
		singlyList.addFirst(60);
		singlyList.addFirst(70);
		singlyList.addFirst(10);
		System.out.println("The list we have:");
		singlyList.displayList();
		singlyList.addFirst(30);
		System.out.println("\nAdding element at first: ");
		singlyList.displayList();
		singlyList.addLast(40);
		singlyList.addLast(80);
		singlyList.addLast(90);
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
		singlyList.listReverse();
		System.out.println("\nList in reverse order: ");
		singlyList.displayList();
		// System.out.print("\nPlease enter the element you are searhing for: ");
		// int seachElement = sc.nextInt();
		int searchElementIndex = singlyList.searchElement(50);
		if (searchElementIndex >= 0) {
			System.out.println("It is present in index " + searchElementIndex);
		} else {
			System.out.println("It is not present in the list");
		}
		System.out.println("Maximum value is the list: " + singlyList.maximumValue());
		System.out.println("Minimum value is the list: " + singlyList.minimumValue());
		Boolean isPalindrome = singlyList.isPalindrome();
		if (isPalindrome) {
			System.out.println("List is palindrome");
		} else {
			System.out.println("List is not palindrome");
		}
		System.out.print("Elements in the list: ");
		singlyList.displayList();
		System.out.println();
		singlyList.removeDuplicate();
		System.out.print("Removing duplicate from the list: ");
		singlyList.displayList();
		singlyList.sortDescend();
		System.out.print("\nList in descending order: ");
		singlyList.displayList();
		singlyList.sortAscend();
		System.out.print("\nList in ascending order: ");
		singlyList.displayList();
		singlyList.sortedInsert(20);
		System.out.print("\nInerting value in a sorted list: ");
		singlyList.displayList();
	}

}
