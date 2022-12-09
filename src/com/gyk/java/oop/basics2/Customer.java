package com.gyk.java.oop.basics2;

public class Customer {
    private String name;
    private String lastName;
    private int age;
    private int personalID;
    private Loan loans[];

    public Customer() {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.personalID = personalID;
        this.loans=loans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPersonalID() {
        return personalID;
    }

    public void setPersonalID(int personalID) {
        this.personalID = personalID;
    }

    public Loan[] getLoans() {
        return loans;
    }

    public void setLoans(Loan[] loans) {
        this.loans = loans;
    }

    @Override
    public String toString() {
        return "Customer" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", personalID=" + personalID;
    }

    public int totalLoansAmount() {
        int sum = 0;
        for (int i = 0; i < this.loans.length; i++) {
            sum += this.loans[i].getAmount();
        }
        return sum;
    }
    public void customerLoanInfo(){
        System.out.println(
                "Customer name: " + this.name + "\n" +
                        "Customer surname: " + this.lastName + "\n" +
                        "Customer age: " + this.age + "\n" +
                        "Customer personal number: "+this.personalID);
        System.out.println("Has loans: ");
        System.out.println(loans[0]);
        System.out.println(loans[1]);
        System.out.println("Total debt: "+ totalLoansAmount());
    }


}

