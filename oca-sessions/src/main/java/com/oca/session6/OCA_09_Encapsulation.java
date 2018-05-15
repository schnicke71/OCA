package com.oca.session6;

import java.util.ArrayList;
import java.util.List;

public class OCA_09_Encapsulation {
	
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.addAccount("AT43 2011 1292 2194 1000");
		bank.addAccount("AT62 1234 5000 0123 4567");
		bank.addAccount("AT58 1200 0006 9621 6241");
		
		List<String> accounts = bank.getAccounts();
		accounts.add("kuckuck");
		bank.printAccounts();

		bank.accounts.clear();
		bank.printAccounts();
	}
}

class Bank {
	
	public List<String> accounts;
	
	public Bank() { accounts = new ArrayList<>(); }
	
	public List<String> getAccounts() { return accounts; }
	
	public void addAccount(String account) { accounts.add(account); }
	
	public void printAccounts() { System.out.println(accounts); }
}
