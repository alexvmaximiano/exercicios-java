package entities;

import exceptions.BusinessExcepetion;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
        super();
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        super();
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) {
        validateWithdraw(amount);
        balance -= amount;
        
    }

    private void validateWithdraw(Double amount) {
        if (amount > getWithdrawLimit()) {
            throw new BusinessExcepetion("Erro de saque: A quantia excede o limite da conta.");
        }
        if (amount > getBalance()) {
            throw new BusinessExcepetion("Erro de saque: Saldo insuficiente");
        }

    }

    

}
