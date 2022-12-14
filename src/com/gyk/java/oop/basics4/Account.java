package com.gyk.java.oop.basics4;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int creditAccount(int amount){
        return this.balance += amount;
    }

    public int debitAccount(int amount){
        if (amount <= this.balance){
            return this.balance -= amount;
        }
        else{
            System.out.println("Amount exceeded");
            return balance;
        }
    }

    public int transferTo(Account account, int amount){
        if( amount <= this.balance ){
            return this.balance -= amount;
        }
        else {
            System.out.println("Amount exceeded");
            return balance;
        }
    }

    @Override
    public String toString() {
        return "Account: " +
                "id = " + id + ", name = " + name +  ", balance = " + balance +" EUR.";
    }
}
