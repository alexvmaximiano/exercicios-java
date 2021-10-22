package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Malu - ME", 0.0, 500.0);
		
		//UPCASTING => "é-um"
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Ana", 0.0, 200.0);
		Account acc3 = new SavingAccount(1004, "Wagnão", 0.0, 0.01);
		
		//DOWNCASTING => "converter da superclasse para subclasse"
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100);
		//Erro pois ACC3 é SavingAccount e não BusinessAccount
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
