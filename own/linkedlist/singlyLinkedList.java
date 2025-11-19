package linkedlist;

import javax.swing.SingleSelectionModel;

public class singlyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtEnd(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }

        ListNode current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        singlyLinkedList s1 = new singlyLinkedList();
        s1.insertAtEnd(10);
        s1.insertAtEnd(20);
        s1.insertAtEnd(30);
        System.out.println("Arpit");
    }
}


