package com.gyk.java.oop.basics;



public class EmployeeManager {
    public static void main(String[] args) {
        Employee employee1 = new Employee();//"Jonas","Jonaitis","Vadybininkas", "Terminuotas",1000,"June1st");
        employee1.setName("Jonas");
        employee1.setLastName("Jonaitis");
        employee1.setPosition("Vadybininkas");
        employee1.setContractType(ContractType.fromCode(1));
        employee1.setSalary(1000);
        employee1.setStartDate("2020-01-03");

        Employee employee2 = new Employee();
        employee2.setName("Petras");
        employee2.setLastName("Petraitis");
        employee2.setPosition("Suvirintojas");
        employee2.setContractType(ContractType.fromCode(2));
        employee2.setSalary(3000);
        employee2.setStartDate("2015-06-08");

        System.out.println(employee1);
        System.out.println(employee2);

    }
}