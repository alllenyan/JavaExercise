package object.lesson.exet09;

public class Account {
    private String id;
    private double balance;
    private double annualInterestRate;

    public Account() {

    }

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Account(String id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String deposit(double moeny) {
        if (moeny >= 0) {
            balance += moeny;
            return "存款成功! 成功存入:" + moeny;
        } else {
            return "存尼玛，金额都输错了，吃屎吧你!";
        }
    }

    public String withdraw(double money) {
        if (balance >= money && money >= 0) {
            balance -= money;
            return "取款成功! 成功取出: " + money;
        } else {
            return "取尼玛，没钱还取钱!";
        }
    }
}

