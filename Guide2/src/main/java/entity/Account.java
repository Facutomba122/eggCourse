package entity;
import java.util.Scanner;

public class Account {
    int accountNumber;
    double actualBalance;
    long clientID;
    double interest;
    Scanner scanner = new Scanner(System.in);

    public Account() {
    }

    public Account(int accountNumber, double actualBalance, long clientID, double interest) {
        this.accountNumber = accountNumber;
        this.actualBalance = actualBalance;
        this.clientID = clientID;
        this.interest = interest;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getActualBalance() {
        return actualBalance;
    }

    public void setActualBalance(double actualBalance) {
        this.actualBalance = actualBalance;
    }

    public long getClientID() {
        return clientID;
    }

    public void setClientID(long clientID) {
        this.clientID = clientID;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
    
    public Account createAccount(int accountNumber, double actualBalance, long clientID, double interest){
        Account newAccount = new Account(accountNumber, actualBalance, clientID, interest);
        return newAccount;
    }
    
    public void deposit(double amount){
        this.actualBalance += amount; 
    }
    
    public void withdraw(double amount){
        if (this.actualBalance - amount < 0){
            this.actualBalance = 0; 
        } else {
            this.actualBalance -= amount;
        }
    }
    
    public void rapidWithdraw(double amount){
        if (amount > this.actualBalance * 0.2){
            System.out.println("Retiro invalido");
        } else {
            this.actualBalance -= amount;
        }
    }
    
    public double checkBalance(){
        return  this.getActualBalance();
    }     
    
    public void checkAccount(){
        System.out.println(this.getAccountNumber());
        System.out.println(this.getClientID());
        System.out.println(this.getInterest());
    }
}
