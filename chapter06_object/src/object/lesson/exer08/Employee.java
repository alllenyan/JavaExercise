package object.lesson.exer08;

public class Employee {
    private String name;
    private String gender;
    private int age;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String prhone) {
        this.phone = prhone;
    }

    public String getInfo() {
        return name + "\t" + gender + "\t" + age + "\t" + phone;
    }
}
