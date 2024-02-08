package exer14;

public class ExercieseTest {
    public static void main(String[] args) {
        ExercieseTest test = new ExercieseTest();
        test.meeting(new Man());
    }

    public void meeting(Person ps) {
        ps.eat();
        ps.toilet();
        if (ps instanceof Man) {
            Man m1 = (Man)ps;
            m1.smoke();
        }
        if (ps instanceof Woman) {
            Woman w1 = (Woman)ps;
            w1.makeup();
        }
    }
}
