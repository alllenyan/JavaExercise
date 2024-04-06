import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    
    @Test
    public void test(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add(123);

        list.add(2,"CC");
        System.out.println(list);//[AA, BB, CC, 123]
    }

    @Test
    public void test2(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add(123);

        list.set(2,"CC");
        System.out.println(list);//[AA, BB, CC]
    }
}
