package Lab1;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        //Q3
        Account person1 = new Account(1122,20000);
        person1.setAnnualInterestRate(4.5);
        person1.withdraw(2500);
        person1.deposit(3000);
        System.out.printf("Account's Balance : %.2f\n" ,person1.getBalance());
        System.out.printf("Monthly Interest : %.2f\n" ,person1.getMonthlyInterest());
        System.out.println("Date of Creation : " + person1.getDataCreated().toString());
        System.out.println();
        //Q4
        Account1 person2 = new Account1("George",1122,1000);
        person2.setAnnualInterestRate(1.5);
        person2.deposit(30);
        person2.deposit(40);
        person2.deposit(50);
        person2.withdraw(5);
        person2.withdraw(4);
        person2.withdraw(2);
        System.out.println("Holder's Name : " + person2.getName());
        System.out.printf("Monthly Interest Rate : %.2f\n", person2.getMonthlyInterestRate());
        System.out.printf("Balance : %.2f\n\n", person2.getBalance());
        System.out.println("---Transaction Record---");

        ArrayList<Transaction> temp = person2.getTransaction();
        for(int i=0; i<temp.size(); i++){
            System.out.println("Date of this transaction : " + temp.get(i).getDate());
            System.out.println("Type of this transaction : " + temp.get(i).getType());
            System.out.println("Amount of this transaction : " + temp.get(i).getAmount());
            System.out.println("New Balance of this transaction : " + temp.get(i).getBalance()  );
            System.out.println("Description of this transaction : " + temp.get(i).getDescription());
            System.out.println();
        }



    }
}
