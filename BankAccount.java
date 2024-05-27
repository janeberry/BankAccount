package BankAccount;

public class BankAccount {
    private String name;
    private double balance;
    private int transactions;
    private double transactionsFee;

    public BankAccount (String id){
        name = id;
    }

    public String toString() {
        if (balance < 0) {
            return name + ", -$" + String.format("%.2f", Math.abs(balance));
        }
        return name + ", $" + String.format("%.2f", balance);
    }

    public String getID (){
        return name;
    }

    public double getBalance (){
        return balance;
    }

    public double getTransaction (){
        double total = 0;
        for (int i=0; i<=transactions; i++){
            total += i*transactionsFee;
        }
        return total;
    }

    public void deposit (double amount){
        if (balance <= 500 && balance >= 0) {
            transactions++;
            balance += amount;
        }
    }

    public void withdraw (double amount){
        if (balance >= amount){
            transactions++;
            balance -= amount;
        }
    }

    public boolean transactionFee (double fee){
        transactionsFee = fee;
        double subtraction = 0;
        for (int i=1; i<=transactions; i++){
            subtraction = i * fee;
            balance -= subtraction;
        }
        if (balance < subtraction) {
            balance = 0.0;
            return false;
        }
        return true;
    }

    public void transfer (BankAccount acc, double amount){
        if (amount < 0 || balance < amount){

        }

    }



}
