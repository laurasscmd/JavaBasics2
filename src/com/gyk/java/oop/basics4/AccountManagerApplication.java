package com.gyk.java.oop.basics4;

public class AccountManagerApplication {

    public static void main(String[] args) {

        Account account1 = new Account("1", "Customer1", 100);
        Account account2 = new Account("2", "Cusotmer2", 50);

        account1.creditAccount(20);
        System.out.println(account1.getBalance());
        account1.creditAccount(10);
        System.out.println(account1.getBalance());
        account2.creditAccount(10);
        System.out.println(account2.getBalance());
        account1.debitAccount(500);
        account2.transferTo(account1,70);
        account1.debitAccount(30);
        account1.transferTo(account2,10);
        System.out.println(account1 + "\n" + account2);

    }
}
