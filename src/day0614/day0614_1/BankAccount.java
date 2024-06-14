package day0614.day0614_1;

public class BankAccount {
    private int balance;

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException("잔액 부족");
        }
        balance -= amount;
    }
}
