import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {
    @Test
    public void test1(){
        HashMap map = new HashMap();
        map.put("name","Jack");
        System.out.println(map.toString());
    }
}
