package exer09;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(1122, 20000, 0.045);

        System.out.println("*************取30000块****************");
        account1.withdraw(30000);

        System.out.println("*************取2500块****************");
        account1.withdraw(2500);

        System.out.println("*************存2500块****************");
        account1.deposit(3000);

        System.out.println("*************查询月利率****************");
        System.out.println("月利率为：" + account1.getMonthlyInterest() * 100 + "%");

    }
}
