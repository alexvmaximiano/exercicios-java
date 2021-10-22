package application;

import entities.Account;
import entities.BusinessAccount;

public class Program2 {

	public static void main(String[] args) {
		
		Account acc1 = new BusinessAccount(1001, "Alex", 1000.0, 500.0);
		acc1.withdraw(500.0);
		
		System.out.println(acc1.getBalance());
		
	}

}
