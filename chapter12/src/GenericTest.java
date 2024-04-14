import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericTest {
    @Test
    public void test1(){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(96);
        integers.add(88);
        integers.add(68);
        integers.add(42);

//        integers.add("AA");
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            Integer score = iterator.next();
            System.out.println(score);
        }
    }
}
