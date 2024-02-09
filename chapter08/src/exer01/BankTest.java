package exer01;

public class BankTest {
    public static void main(String[] args) {
        Bank bank1 = Bank.getBankData();
        Bank bank2 = Bank.getBankData();
        System.out.println(bank1 == bank2);
    }
}
