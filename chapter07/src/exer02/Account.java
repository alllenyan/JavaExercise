package exer02;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amout){
        if (amout >= 0){
            balance += amout;
            System.out.println("存好了，滚吧");
        }else {
            System.out.println("别存了，存尼玛呢");
        }
    }

    public void withdraw(double amout){
        if (balance >= amout && amout >= 0){
            balance -= amout;
            System.out.println("取完了，滚吧");
        }else {
            System.out.println("取尼玛呢金额都输错了");
        }
    }

}
