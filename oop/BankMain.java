package oop;

import java.util.ArrayList;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account1 = new Account("Kevin Smith", "123456789", 20098.98);
        Account account2 = new Account("Mary Jones", "123940283", 45098.76);
        Account account3 = new Account("Wanda Sparks", "349738473", 198.87);
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        ArrayList<Account> accounts = bank.getAccounts();
        for(Account account: accounts) {
            System.out.println(account.getAccountInfo());
        }

        System.out.println("\nAfter depositing 1000 into account1:");
        bank.depositMoney(account1, 1000);
        System.out.println(account1.getAccountInfo());

        System.out.println("\nAfter depositing 2300.98 into account2:");
        bank.depositMoney(account2, 2300.98);
        System.out.println(account2.getAccountInfo());

        System.out.println("\nAfter depositing 4500.98 into account3:");
        bank.depositMoney(account3, 4500.98);
        System.out.println(account3.getAccountInfo());
    }
}
