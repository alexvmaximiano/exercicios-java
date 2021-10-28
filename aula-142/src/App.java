import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessExcepetion;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados da conta: ");
        System.out.print("Número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Nome do correntista: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Valor do depósito inicial: R$ ");
        double balance = sc.nextDouble();

        System.out.print("Valor do limite de saque: R$ ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(numeroConta, holder, balance, withdrawLimit);
        System.out.println();
        System.out.print("Informe uma quantia para sacar: R$ ");
        double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
        } catch (BusinessExcepetion e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
