package exer09;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate; //年利率

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    //针对余额属性，实际中不应提供set方法直接设置值内容，应提供对应的增删改的方法对其进行操作
    //本例中的增删改的方法即为存钱和取钱方法
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest() { //月利率
        return annualInterestRate / 12;
    }

    public void withdraw(double amount) { //取款
        if (amount < 0) {
            System.out.println("你别取钱了，吃屎去吧你");
            printBalance();
        } else if (amount > balance) {
            System.out.println("你没钱，取尼玛呢，赚钱去吧");
            printBalance();
        } else {
            balance -= amount;
            System.out.println("取钱成功！");
            printBalance();
        }
    }

    public void deposit(double amount) { //存款
        if (amount < 0) {
            System.out.println("你别存了，傻逼");
            printBalance();
        } else {
            balance += amount;
            System.out.println("存钱成功！");
            printBalance();
        }
    }

    public void printBalance() {
        System.out.println("你的账户余额为：" + balance);
    }
}
