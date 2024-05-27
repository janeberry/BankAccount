package BankAccount;

public class BankAccountClient {
    public static void main(String[] args) {
        /*
        BankAccount savings = new BankAccount("Jane");

        System.out.println(savings);

        savings.getBalance(500);
        System.out.println(savings);

        savings.deposit(500);
        System.out.println(savings);

        savings.withdraw(300);
        System.out.println(savings);

        savings.transactionFee(5);
        System.out.println(savings);

        System.out.println(savings.getTransaction());

        System.out.println("---------------------------------");

         */

        BankAccount ben = new BankAccount("Benson");
        ben.deposit(90);
        System.out.println(ben.getBalance());
        BankAccount mar = new BankAccount("Marty");
        mar.deposit(25);

        ben.transfer(mar, 20);
        mar.transfer(ben, 10);






    }
}