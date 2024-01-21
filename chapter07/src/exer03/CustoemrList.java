package exer03;

public class CustoemrList {
    private Customer[] customers;
    private int total;

    public CustoemrList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer) {
        if (total < customers.length) {
            customers[total++] = customer;
            return true;
        }
        return false;
    }

    public boolean replaceCustomer(int index, Customer cust) {
        if (index >= 0 && index < total) {
            customers[index] = cust;
            return true;
        }
        return false;
    }

    public boolean deleteCustomer(int index) {
        if (index < 0 || index > total) {
            return false;
        }
        for (int i = 0; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        customers[total - 1] = null;
        total--;
        return true;
    }

    public Customer[] getAllCustomers() {
        System.out.println("-------------------客户列表-------------------");
        System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t邮箱");
        for (int i = 0; i < total; i++) {
            System.out.println((i + 1) + "\t" + customers[i].getName() + "\t" + customers[i].getGender() + "\t" +
                    customers[i].getAge() + "\t" + customers[i].getPhoneNumber() + "\t" + customers[i].getEmail());
        }
        System.out.println("-------------------客户列表完成----------------");
        return customers;
    }

    public Customer getCustomer(int index) {
        return customers[index - 1];
    }

    public int getTotal() {
        return total;
    }
}
