package ru.intodayer;

import ru.intodayer.bank.Bank;


public class BankUser extends Thread {
    private final Bank bank;
    private int moneyAmount;

    public BankUser(Bank bank, int moneyAmount) {
        this.bank = bank;
        this.moneyAmount = moneyAmount;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bank) {
                try {
                    if (bank.hasMoney()) {
                        System.out.println(getName() + "\t| bank account: " + bank.getBankAccount());
                        bank.getMoney(moneyAmount);
                        Thread.sleep(10);
                    } else {
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
