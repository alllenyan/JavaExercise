package exer02;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank() {
        customers = new Customer[5];
    }

    public void addCustomer(String firstName,String lastName){
        Customer customer = new Customer(firstName,lastName);
        customers[numberOfCustomer++] = customer;
    }

    public int getNumberOfCustomer(){
        return numberOfCustomer;
    }

    public Customer getCustomer(int index){
        return customers[index];
    }
}
