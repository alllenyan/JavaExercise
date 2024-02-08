package exer12;

public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test1 = new GeometricTest();
        System.out.println(test1.displayGeometricObject(new Circle("Red", 10, 2)));
        System.out.println(test1.displayGeometricObject(new MyRectangle("red", 10, 10, 2)));
        System.out.println(test1.equalsArea(new Circle("Red", 10, 2), new MyRectangle("red", 10, 10, 2)));

    }

    public boolean equalsArea(GeometricObject g1,GeometricObject g2){
        if(g1.findArea() == g2.findArea()){
            return true;
        }else {
            return false;
        }
    }

    public double displayGeometricObject(GeometricObject g1){
        return g1.findArea();
    }
}
