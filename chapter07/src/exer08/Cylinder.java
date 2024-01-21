package exer08;

public class Cylinder extends Circle {

    private double length;
    public Cylinder() {
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return super.findArea() * length;
    }

    //圆柱体的表面积，两个底面积加侧边面积
    public double findArea(){
        return Math.PI * getRadius() * getRadius() * 2 + Math.PI * 2 * getRadius() * length;
    }
}
