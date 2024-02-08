package exer11;

public class Man extends Person{

    private int phone;

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void eat(){
        System.out.println("Man eat");
    }

    public void earnMoney(){
        System.out.println("Man earn Money");
    }

    public void walk(){
        System.out.println("Man walk");
    }
}
