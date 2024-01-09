package BankingSystem;
import java.util.Scanner;
public class LotakBank implements Bank{
    private String bankAccountNo;

    private double balance;

    private String password;

    public static final double rateOfInterest = 6.5;

    public LotakBank() {

        //TODO task : Random generator function
        //Generate a 10 digit account No and initialize the account numer
        this.balance = balance;
        this.password = password;
    }
    public String addMoney(int money) {
        balance = balance + money;
        return "The "+money+" has been added. New balance is "+balance;
    }

    public String checkBalance(String password) {
        if(password.equals(this.password)){
            return "The balance is "+this.balance;
        }
        else
            return "The password entered is incorrect !!";

    }

    public String withdrawMoney(String password, int money) {
        if(password.equals(this.password)){

            if(balance>=money){
                balance = balance - money;
                return "The money has been withdrawn, new balance is "+balance;
            }
            else
                return "Sufficient balance is not available";
        }else
            return "The password entered in incorect";

    }

    public double getRateOfInterest(int years) {

        double totalInterest = (balance*LotakBank.rateOfInterest*years)/100;
        return totalInterest;
    }
}
