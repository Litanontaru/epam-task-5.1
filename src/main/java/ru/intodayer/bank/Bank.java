package ru.intodayer.bank;


public class Bank {
    private int bankAccount;

    public Bank(int moneyAmount) {
        this.bankAccount = moneyAmount;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    private void checkEnoughMoney(int amount) {
        if (bankAccount - amount < 0)
            throw new NotEnoughMoneyException(
                    NotEnoughMoneyException.getMessage(bankAccount, amount)
            );
    }

    public void getMoney(int amount) {
        checkEnoughMoney(amount);
        bankAccount -= amount;
    }

    public boolean hasMoney() {
        return bankAccount > 0;
    }
}
