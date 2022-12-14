package com.gyk.java.oop.basics2;

import static com.gyk.java.oop.basics2.LoanType.*;
import static com.gyk.java.oop.basics2.LoanType.*;

public class LoansApplication {
    public static void main(String[] args) {


        Loan loan1 = new Loan();
        loan1.setLoanID(78);
        loan1.setAmount(1000);
        loan1.setLoanType(LoanType.fromCode(1));
        loan1.setTerminationDate("2023-01-04");

        Loan loan2 = new Loan();
        loan2.setLoanID(79);
        loan2.setAmount(500);
        loan2.setLoanType(LoanType.fromCode(2));
        loan2.setTerminationDate("2024-06-15");

        //System.out.println(loan1);
        //System.out.println(loan2);

        Loan[] loans = new Loan[2];
        loans[0] = loan1;
        loans[1] = loan2;

        System.out.println(loans[0]);
        System.out.println(loans[1]);

        Customer customer1 = new Customer();
        customer1.setName("Jonas");
        customer1.setLastName("Jonaitis");
        customer1.setAge(54);
        customer1.setPersonalID(1234);
        customer1.setLoans(loans);


        customer1.customerLoanInfo();
        //System.out.println(customer1);


    }
}