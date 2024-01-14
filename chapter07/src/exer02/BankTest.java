package exer02;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("zh","y");
        bank.addCustomer("zh2","y");



        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(0).getAccount().deposit(2000);
        System.out.println(bank.getCustomer(0).getAccount().getBalance());

        bank.getCustomer(0).getAccount().withdraw(500);
        System.out.println(bank.getCustomer(0).getAccount().getBalance());

        System.out.println(bank.getNumberOfCustomer());
    }
}
