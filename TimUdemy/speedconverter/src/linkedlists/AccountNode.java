package linkedlists;

import constructors.Account;

public class AccountNode {

    private Account account;

    private AccountNode next;

    public AccountNode(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public AccountNode getNext() {
        return next;
    }

    public void setNext(AccountNode next) {
        this.next = next;
    }

    public String toString() {
        return account.toString();
    }
}
