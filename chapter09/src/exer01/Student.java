package exer01;

public class Student {
    private String name;
    private int id;

    public Student() {
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setID(int id){
        if (id > 0){
            this.id = id;
        }else {
            throw new RuntimeException("生命值不能为负数:" + id);
        }
    }
}
