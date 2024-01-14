package object.lesson.exet09;

public class TriAngle {
    private double height;
    private double base;

    public TriAngle(double i,double j){
        setHeight(i);
        setBase(j);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double findArea(){
        return height * base / 2;
    }
}
