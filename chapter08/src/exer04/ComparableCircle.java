package exer04;

public class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
        if (o instanceof ComparableCircle){
            ComparableCircle c1 = (ComparableCircle) o;
            if (this.getRadius() > c1.getRadius()){
                return 1;
            } else if (this.getRadius() < c1.getRadius()) {
                return -1;
            }else {
                return 0;
            }
        }else {
            return 2;
        }
    }

}
