package ru.intodayer;

import ru.intodayer.bank.Bank;


public class BankUser extends Thread {
    private Bank bank;
    private int moneyAmount;

    public BankUser(Bank bank, int moneyAmount) {
        this.bank = bank;
        this.moneyAmount = moneyAmount;
    }

    @Override
    public void run() {
        if (bank.hasMoney())
            bank.getMoney(moneyAmount);
    }
}
