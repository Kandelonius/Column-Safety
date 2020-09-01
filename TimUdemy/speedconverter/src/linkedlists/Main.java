package linkedlists;

import constructors.Account;

public class Main {
    public static void main(String[] args) {

        Account janeDoe = new Account(101,
            150,
            "Jane Doe");
        Account johnDoe = new Account(102,
            150,
            "John Doe");
        Account marySmith = new Account(103,
            150,
            "Mary Smith");
        Account mikeWilson = new Account(104,
            150,
            "Mike Wilson");
        Account billKent = new Account(105,
            150,
            "Bill Kent");

        SinglyLinkedList myList = new SinglyLinkedList();
        System.out.println(myList.isEmpty());
        myList.addToFront(billKent);
        myList.addToFront(marySmith);
        myList.addToFront(johnDoe);
        myList.addToFront(janeDoe);
        myList.addToFront(mikeWilson);

        System.out.println(myList.getSize());

        myList.removeFromFront();

        System.out.println(myList.getSize());

        myList.printList();
    }
}
