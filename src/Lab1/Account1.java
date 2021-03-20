package Lab1;

import java.util.ArrayList;
import java.util.Date;

public class Account1{
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    private ArrayList<Transaction> transaction = new ArrayList<Transaction>();

    public Account1() {
    }

    public Account1(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Account1(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate/100;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amountWithdraw){
        balance -= amountWithdraw;
        transaction.add(new Transaction(new Date(), 'W', amountWithdraw, balance, "Withdraw"));
    }

    public void deposit(double amountDeposit){
        balance += amountDeposit;
        transaction.add(new Transaction(new Date(), 'W', amountDeposit, balance, "Withdraw"));
    }

    public ArrayList<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(ArrayList<Transaction> transaction) {
        this.transaction = transaction;
    }
}
