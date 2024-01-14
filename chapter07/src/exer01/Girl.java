package exer01;

public class Girl {
    private String name;
    private int age;

    public Girl(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy boy) {
        System.out.println("Yes, I do");
        boy.marry(this);
    }

    public void compare(Girl girl) {
        if (this.age > girl.age) {
            System.out.println(this.name + "Bigger");
        } else {
            System.out.println(girl.name + "Bigger");
        }
    }
}

