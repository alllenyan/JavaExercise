import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest{


    @Test
    public void test(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add(123);
        System.out.println(list.toString());
    }

    @Test
    public void test2(){
        List list1 = new ArrayList();
        list1.add("AA");
        list1.add("BB");
        list1.add(123);

        List list2 = new ArrayList();
        list2.add("CC");
        list2.add("DD");
        list2.add(new Person(20,"Jack"));
        //list1.add(list2);//[AA, BB, 123, [CC, DD, Person@326de728]]
        list1.addAll(list2);
        System.out.println(list1.toString());//[AA, BB, 123, CC, DD, Person@326de728]
    }

    @Test
    public void test3(){
        List list1 = new ArrayList();
        list1.add("AA");
        list1.add("BB");
        list1.add(123);
        System.out.println(list1.toString());
        list1.clear();
        System.out.println(list1.toString());
    }

    @Test
    public void test4(){
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        list1.add("AA");
        list1.add("BB");
        list1.add(123);
        System.out.println(list1.isEmpty());
        System.out.println(list2.isEmpty());
    }

    @Test
    public void test5(){
        List list1 = new ArrayList();
        list1.add("AA");
        list1.add("BB");
        list1.add(123);
        System.out.println(list1.size());
    }
    
    @Test
    public void test6(){
        List list1 = new ArrayList();
        list1.add("AA");
        list1.add("BB");
        list1.add(123);
        List list2 = new ArrayList();
        list2.add("AA");
        System.out.println(list1.contains("CC"));
        System.out.println(list1.contains("AA"));
    }

    @Test
    public void test7(){
        List list1 = new ArrayList();
        list1.add("AA");
        list1.add("BB");
        list1.add(123);
        List list2 = new ArrayList();
        list2.add("AA");
        list2.add("CC");
//        list2.add("BB");
        System.out.println(list1.containsAll(list2));
    }

    @Test
    public void test8(){
        List list1 = new ArrayList();
        list1.add("AA");
        list1.add("BB");
        list1.add(123);
        list1.add(new Person(12,"AHa"));
        System.out.println(list1.toString());
        list1.remove(Integer.valueOf(1234));
        System.out.println(list1.toString());

        List list2 = new ArrayList();
        list2.add("AA");
        list2.add(1234);
        list1.removeAll(list2);
        System.out.println(list1.toString());
    }

    @Test
    public void test9(){
        List list1 = new ArrayList();
        list1.add("AA");
        list1.add("BB");
        list1.add(123);
        list1.add(new Person(12,"AHa"));
        System.out.println(list1.toString());
        list1.remove(Integer.valueOf(1234));
        System.out.println(list1.toString());

        List list2 = new ArrayList();
        list2.add("AA");
        list2.add(1234);
        list1.retainAll(list2);
        System.out.println(list1.toString());
    }

    @Test
    public void test10(){
        List list1 = new ArrayList();
        list1.add("AA");
        list1.add("BB");
        list1.add(123);
        System.out.println(list1.hashCode());
    }

    @Test
    public void test11(){
        List list1 = new ArrayList();
        list1.add("AA");
        list1.add("BB");
        list1.add(123);
        System.out.println(list1.equals(123));//false

    }
}
