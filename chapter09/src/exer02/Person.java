package exer02;

public class Person {
    private String name;
    private int lifeValue;

    public Person() {
    }

    public Person(String name, int lifeValue) {
        setName(name);
        setLifeValue(lifeValue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        if (lifeValue > 0){
            this.lifeValue = lifeValue;
        }else {
            throw new NoLifeValueException("生命值不能为负数:" + lifeValue);
        }

    }


}
