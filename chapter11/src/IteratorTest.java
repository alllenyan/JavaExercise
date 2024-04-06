import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    
    @Test
    public void test(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add(123);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());//next():①指针下移 ② 将下移以后集合位置上的元素返回
        }
    }

    @Test
    public void test2(){
        //Iterator中的 remove()方法
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add(123);
        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            Object obj = iterator.next();
            if (obj.equals(123)){
                iterator.remove();
            }
        }
        System.out.println(list.toString());
    }

    @Test
    public void test3(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add(123);

        for (Object obj : list){
            System.out.println(obj);
        }
    }
}
