package exer09;

public class CheckAccount extends Account {

    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate,double overdraft){
        super(id,balance,annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public void printOverdraft(){
        System.out.println("你的信用卡余额为:" + overdraft);
    }

    public void withdraw(double amount) { //取款
        if (getBalance()  >= amount){
            super.withdraw(amount);
        }else if(getBalance() + overdraft >= amount){
            overdraft -= amount - getBalance();
            super.withdraw(getBalance());
            printOverdraft();
        }else {
            System.out.println("你什么钱都没有了");
            printBalance();
            printOverdraft();
        }

    }
}
