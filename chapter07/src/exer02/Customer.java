package exer02;

public class Customer {
    private String firsName;
    private String lastName;
    private Account account;

    public Customer(String firsName, String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public Account getAccount(){
        return account;
    }



}
