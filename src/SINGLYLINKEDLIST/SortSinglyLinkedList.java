package SINGLYLINKEDLIST;


import java.util.Scanner;

public class SortSinglyLinkedList {
    
    private ListNode head;
    
    private static class ListNode {
        private int data;
        private ListNode next;
        
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    // Method to sort the linked list using Selection Sort
    public void sortList() {
        ListNode current = head;
        while (current != null) {
            ListNode index = current.next;
            ListNode min = current;
            while (index != null) {
                if (index.data < min.data) {
                    min = index;
                }
                index = index.next;
            }
            int temp = current.data;
            current.data = min.data;
            min.data = temp;
            current = current.next;
        }
    }
    
    public static void main(String[] args) {
        SortSinglyLinkedList list = new SortSinglyLinkedList();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the linked list:");
        int n = scan.nextInt();
        
        if (n > 0) {
            System.out.println("Enter elements:");
            list.head = new ListNode(scan.nextInt());
            ListNode current = list.head;
            for (int i = 1; i < n; i++) {
                current.next = new ListNode(scan.nextInt());
                current = current.next;
            }
            System.out.println("Given Linked list:");
            list.display(list.head);
            
            list.sortList();
            System.out.println("\nSorted linked list:");
            list.display(list.head);
        } else {
            System.out.println("The linked list is empty.");
        }
        scan.close();
    }
}
