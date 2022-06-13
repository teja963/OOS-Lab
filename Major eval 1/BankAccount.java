import java.io.*;
import java.util.*;

class BankAccount{
    private double balance;
    public BankAccount(double amount){
        this.balance = amount;
    }
    
    public double getMonthEndBalance(){
        return this.balance;   
    }
}

class SavingAccount extends BankAccount{
    public SavingAccount(double amount){
        super(amount);
    }
    
    public double getMonthEndBalance (){
        double current = super.getMonthEndBalance();
        return current + current*0.07;
    }
}

class CheckingAccount extends BankAccount{
    public CheckingAccount(double amount){
        super(amount);
    }
    
    public double getMonthEndBalance(){
        double current = super.getMonthEndBalance();
        current = current+current*0.07;
        current = current - 0.1*current;
        if(current < 100)
            current-=10;
        return current;
    }
}

 

public class Solution {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String input = scanner.nextLine();
        String[] details = input.split(":");
        BankAccount account;
        if(details[0].equals("SavingAccount"))
                account = new SavingAccount(Double.parseDouble(details[1]));
        else if(details[0].equals("CheckingAccount"))
                account = new CheckingAccount(Double.parseDouble(details[1]));
        else
                account = new BankAccount(Double.parseDouble(details[1]));
        double money = account.getMonthEndBalance();
        
        if(money <= 20)
            System.out.println("overdraft");
        else if(details[0].equals("BankAccount"))
            System.out.println("invalidAccount");
        else
            System.out.println(Math.round(money*100)/100D);
    }
}
