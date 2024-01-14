package object.lesson.exet09;

public class Customer {
    private String lastName;
    private String firstName;
    private Account account;

    public Customer() {

    }

    public Customer(String l, String f) {
        this.lastName = l;
        this.firstName = f;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return this.account;

    }
}
