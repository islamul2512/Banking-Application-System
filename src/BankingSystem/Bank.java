package BankingSystem;

public interface Bank {
    public int repoRate = 5;
    public String addMoney(int money);
    public String checkBalance(String password);
    public String withdrawMoney(String password, int money);
    public double getRateOfInterest(int years);
}
