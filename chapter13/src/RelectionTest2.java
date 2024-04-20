import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RelectionTest2 {

    @Test
    public void test1() throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Person.class;


        Constructor declaredConstructor = clazz.getDeclaredConstructor(int.class);
        declaredConstructor.setAccessible(true);
        Object o = declaredConstructor.newInstance(12);


        Field declaredFields = clazz.getDeclaredField("name");
        declaredFields.setAccessible(true);

        declaredFields.set(o,"MotherFucker");
        System.out.println(declaredFields.get(o));


    }

    @Test
    public void test2() throws NoSuchFieldException, IllegalAccessException {
        Class clazz = Person.class;

        Field declaredFields = clazz.getDeclaredField("info");
        declaredFields.setAccessible(true);

        declaredFields.set(clazz,"Howareyou");
        System.out.println(declaredFields.get(clazz));
    }

    @Test
    public void test3() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Person.class;

        Constructor declaredConstructor = clazz.getDeclaredConstructor(int.class);
        declaredConstructor.setAccessible(true);
        Object o = declaredConstructor.newInstance(12);

        Method showInfo = clazz.getDeclaredMethod("showInfo");
        showInfo.setAccessible(true);
        System.out.println(showInfo.invoke(o));
    }

    @Test
    public void test4() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Person.class;

        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object object = constructor.newInstance();
        System.out.println(object);
    }
}
