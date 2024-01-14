package object.lesson.exet09;

public class CustomerTest {
    public static void main(String[] args) {

        Customer c1 = new Customer("Simth","Jane");
        Account account = new Account("1000",2000,1.23);

        c1.setAccount(account);

        System.out.println(c1.getAccount().deposit(100));
        System.out.println(c1.getAccount().withdraw(960));
        System.out.println(c1.getAccount().withdraw(2000));
        System.out.println(c1.getAccount().getBalance());

    }
}
