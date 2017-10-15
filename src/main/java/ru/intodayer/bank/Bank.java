package ru.intodayer.bank;


public class Bank {
    private int moneyAmount;

    public Bank(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    private void checkEnoughMoney(int amount) {
        if (moneyAmount - amount < 0)
            throw new NotEnoughMoneyException(
                    NotEnoughMoneyException.getMessage(moneyAmount, amount)
            );
    }

    public void getMoney(int amount) {
        checkEnoughMoney(amount);
        moneyAmount -= amount;
    }

    public boolean hasMoney() {
        return moneyAmount > 0;
    }
}
