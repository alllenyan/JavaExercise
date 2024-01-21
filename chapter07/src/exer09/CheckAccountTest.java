package exer09;

public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount1 = new CheckAccount(11122,20000,0.045,5000);
        System.out.println("***********第一次取钱：5000*****************");
        checkAccount1.withdraw(5000);
        System.out.println("***********第二次取钱：18000*****************");
        checkAccount1.withdraw(18000);
        System.out.println("***********第三次取钱：3000*****************");
        checkAccount1.withdraw(3000);

    }
}
