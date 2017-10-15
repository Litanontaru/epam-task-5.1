package ru.intodayer;

import ru.intodayer.bank.Bank;


public class App {
    public static void main(String[] args) {
        Bank bank = new Bank(100);
        BankUser[] bankUsers = new BankUser[1000];

        for (int i = 0; i < bankUsers.length; i++) {
            bankUsers[i] = new BankUser(bank, 1);
        }

        for (int i = 0; i < bankUsers.length; i++) {
            bankUsers[i].start();
        }
    }
}
