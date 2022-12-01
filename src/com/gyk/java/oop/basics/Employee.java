

package com.gyk.java.oop.basics;


public class Employee {



    //variables
    private String name;
    private String lastName;
    private String position;
    private ContractType contractType;
    private Integer salary;
    private String startDate;

    //constructor with arguments

    public Employee(String name, String lastName, String position, ContractType contractType, Integer salary, String startDate) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.contractType = contractType;
        this.salary = salary;
        this.startDate = startDate;
    }
    //constructor without arguments
    public Employee() {

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", contractType='" + contractType + '\'' +
                ", salary=" + salary +
                ", startDate='" + startDate + '\'' +
                '}';
    }
}
