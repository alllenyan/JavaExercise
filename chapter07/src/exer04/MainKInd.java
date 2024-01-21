package exer04;

public class MainKInd {
    private int sex;
    private int salary;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman() {
        switch (sex) {
            case 1:
                System.out.println("man");
                break;
            case 0:
                System.out.println("woman");
                break;
            default:
                System.out.println("输错了傻逼");
        }
    }

    public void employeed() {
        if (salary > 0) {
            System.out.println("job");
        } else if (salary == 0) {
            System.out.println("not fucking job");
        } else {
            System.out.println("又输错了傻逼");
        }
    }
}
