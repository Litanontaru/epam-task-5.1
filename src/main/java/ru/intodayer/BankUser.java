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
        while (bank.hasMoney()) {
            try {
                System.out.println(getName() + " bank has " + bank.getBankAccount());
                bank.getMoney(moneyAmount);
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
