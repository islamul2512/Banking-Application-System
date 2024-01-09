package BankingSystem;

public class NoBank implements Bank{
    public int accountNo;

    public String accountName;

    private String secretCode;

    private double balance;

    public double minBalance;

    public static final double rateOfInterest = 8.5;
    public NoBank(String accountName, String secretCode, double balance) {
        //Account no : generate a random and store it
        this.accountName = accountName;
        this.secretCode = secretCode;
        this.balance = balance;
        minBalance = 5000.0;
    }

    public String addMoney(int money) {
        balance = balance+money;
        return "Final balance is " + balance;
    }

    public String checkBalance(String password) {
        if(password.equals(this.secretCode)){
            return "The balance is "+balance;
        }
        return "Galat password bhra aapne ";

    }

    public String withdrawMoney(String password, int money) {
        if(password.equals(this.secretCode)){

            if(balance>=(money+minBalance)){
                balance = balance - money;
                return "Money withdrawn successfully !! Final balance is "+balance;
            }else
                return "Sufficient balance not available";
        }else {
            return "Wrong password !!";
        }

    }

    public double getRateOfInterest(int years) {
        double totalInterest = (balance*NoBank.rateOfInterest*years)/100;
        return totalInterest;
    }
}
