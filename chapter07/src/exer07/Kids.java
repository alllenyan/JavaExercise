package exer07;

public class Kids extends MainKInd {
    private int yearsOld;

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println("years old is " + yearsOld);
    }

    public void employeed() {
        System.out.println("学生不能工作");
    }

}
