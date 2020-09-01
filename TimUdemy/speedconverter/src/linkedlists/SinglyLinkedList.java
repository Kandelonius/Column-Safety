package linkedlists;

import constructors.Account;

public class SinglyLinkedList {
    private AccountNode head;
    private int size;

    public void addToFront(Account account) {
        AccountNode node = new AccountNode(account);
        node.setNext(head);
        head = node;
        size++;
    }

    public AccountNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        AccountNode removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return this.size == 0;
        /*
        or we could do
        return head == null;
         */
    }

    public void printList() {
        AccountNode cur = head;
        System.out.println("HEAD -> ");
        while (cur != null) {
            System.out.print(cur);
            System.out.print(" -> ");
            cur = cur.getNext();
        }
        System.out.println("null");
    }
}
